package com.fortitude.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fortitude.dto.AccountDto;
import com.fortitude.dto.InvestDto;
import com.fortitude.dto.ProjectDto;
import com.fortitude.dto.TransferDto;
import com.fortitude.enums.CategoryEnum;
import com.fortitude.enums.ReturnTypes;
import com.fortitude.service.AccountService;
import com.fortitude.service.InvestService;
import com.fortitude.service.ProjectService;
import com.fortitude.service.TransferService;
import com.fortitude.vo.InvestmentVo;
import com.fortitude.vo.ProjectVo;
@RequestMapping("/fortitude")
@Controller
public class fortitudeController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	ProjectService projectService;
	
	@Autowired 
	TransferService transferService;
	
	@Autowired
	InvestService investService;
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hi there, this website is still under construction</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	/**
	 * All page view Methods start
	 */
	
	@RequestMapping(value = {"/myAccount", "account"}, method = RequestMethod.GET)
	public String getAccount(HttpServletRequest request, HttpServletResponse response, Model model){
		String userId = request.getRemoteUser();
		AccountDto accountDto = accountService.getAccount(userId);
		System.out.println("Getting here"+ accountDto);
		model.addAttribute("account", accountDto);
		 
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO 
		 * Here we will have to fill all the information in account page as follows
		 *	1. Acc History
		 *	2. Other Account information
		 *		2.1 Transaction history
		 *		2.2 Bonus Management
		 *		2.3	Interest Gain
		 *		2.4	Geneology tree
		 *		2.5	Buy Lite coin
		 *	and return account page after filing this information
		 */
		return "/page/account";
	}
	
	@RequestMapping(value = "/addProjects", method = RequestMethod.GET)
//	public ModelAndView getProjects(HttpServletRequest request, HttpServletResponse response){
	public String getProjects(HttpServletRequest request, HttpServletResponse response,Map<String, Object> model){
		//ModelAndView model = new ModelAndView("/page/projects/addProjects");
		
		ProjectDto projectsDto = new ProjectDto();
		model.put("projectsBean", projectsDto);
		//model.addObject("projectsBean", projectsDto);
		List<String> categoryList = new ArrayList<>();
		categoryList.add(CategoryEnum.DIGITAL_CURRENCIES.toString());
		categoryList.add(CategoryEnum.FINTECH.toString());
		categoryList.add(CategoryEnum.FOOD_AND_DINING.toString());
		categoryList.add(CategoryEnum.MUSIC.toString());
		categoryList.add(CategoryEnum.REAL_ESTATE.toString());
		categoryList.add(CategoryEnum.RENEWABLE_ENERGY.toString());
		categoryList.add(CategoryEnum.TECHNICAL.toString());
		categoryList.add(CategoryEnum.WINES_AND_LIQUOR.toString());
		
		List<String> returnTypeList = new ArrayList<>();
		returnTypeList.add(ReturnTypes.HALF_YEAR.toString());
		returnTypeList.add(ReturnTypes.MONTHLY.toString());
		returnTypeList.add(ReturnTypes.SEMI_ANNUAL.toString());
		returnTypeList.add(ReturnTypes.TWO_MONTHS.toString());
		returnTypeList.add(ReturnTypes.YEARLY.toString());
		model.put("categoryList", categoryList);
		model.put("returnTypeList", returnTypeList);
		
		return "/page/projects/addProjects";
	}
	
	@RequestMapping(value = "/addProjects", method = RequestMethod.POST)
	public String setProjects(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("projectsBean") ProjectDto projectsDto) throws SQLException, ParseException{
		System.out.println("request coming");
		String userId = request.getRemoteUser();
		projectsDto.setProjectOwner(userId);
		Model model = null;
		projectService.addProjects(projectsDto);
		System.out.println("controller called");
		//model.addAttribute("/page/projects");
		return "/page/projects";
	}
	
	
	@RequestMapping(value = "/transferFunds", method = RequestMethod.GET)
	public ModelAndView setTransferFunds(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("transferBean") TransferDto transferDto) throws SQLException{
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		ModelAndView model = null;
		
		/**
		 * TODO
		 * return transfer page
		 */
		return new ModelAndView("/page/transfer/transferFunds");
		//return "/page/account";
	}
	Double sumInvested = 0.0;

	double compoundInterest = 0.0;
	@RequestMapping(value = "/invest", method = RequestMethod.GET)
	public String getInvest(HttpServletRequest request, HttpServletResponse response, Model model) throws SQLException{
		String userId = request.getRemoteUser();
		List<InvestDto> investDtoList = investService.getInvestByUser(userId);
		InvestmentVo investmentVo = makeInvestVo(investDtoList, userId);
		model.addAttribute("investmentVo", investmentVo);
		return "page/projects/invest";

		
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * Here we will have to fill all the information in invest page as follows
		 * 	1	List of project to invest in
		 * 
		 * return invest page
		 */
	//	return "/page/account";
	}
	
	private InvestmentVo makeInvestVo(List<InvestDto> investDtoList, String userId){
		InvestmentVo investmentVo= new InvestmentVo();
		long numberOfProjects = investDtoList.stream().map(f -> f.getProjectId()).distinct().count();
		investDtoList.stream().forEach(f -> {
			sumInvested +=f.getInvestmentAmount();
		});
		List<String> projectIdList = investDtoList.stream().map(f -> f.getProjectId()).collect(Collectors.toList());
		Date currentDate = Date.from(Instant.now());
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
		String formattedDate = formatter.format(currentDate);
		LocalDate currentLocal = LocalDate.parse(formattedDate.toString());
		
		investDtoList.stream().forEach(d ->{
			Date dateOfInvestment = d.getDateOfInvestment();
			LocalDate previousDate = LocalDate.parse(dateOfInvestment.toString());
			long range = ChronoUnit.DAYS.between(previousDate, currentLocal);
			float interest = d.getInterestPerMonth();
			compoundInterest += Math.pow((1+(interest/365)), range);
//			int days = Days.daysBetween(dateOfInvestment, currentDate).getDays();
		});
		investmentVo.setNumberOfProjectsInvested(numberOfProjects);
		investmentVo.setProjectId(projectIdList);
		investmentVo.setTotalInterest(compoundInterest);
		investmentVo.setUserId(userId);
		investmentVo.setTotalInvestmentsMade(sumInvested);
		return investmentVo;
	}
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String getProjects(Model model,String investDto) throws SQLException{
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * This is to put investment information on submit
		 * 
		 * return invest page
		 */
		List<ProjectVo> projects=getProjectVos(projectService.getAllProject());
		model.addAttribute("projects", projects);
		return "/page/projects";
	}
	
	private List<ProjectVo> getProjectVos(List<ProjectDto> allProject) {
		// TODO Auto-generated method stub
		List<ProjectVo> projectVos = new ArrayList<ProjectVo>();
		for(ProjectDto project:allProject){
			ProjectVo projectVo = new ProjectVo();
			projectVo.setProjectCost(project.getProjectCost());
			projectVo.setProjectId(project.getProjectId());
			projectVo.setProjectName(project.getProjectName());
			projectVo.setProjectOwner(project.getProjectOwner());
			projectVo.setReturnPromised(project.getReturnPromised());
			projectVo.setReturnType(project.getReturnType());
			projectVo.setTenure("7");
			projectVo.setCurrentInvestment(project.getCurrentInvestment());
			projectVo.setMinimumAmountToInvest(project.getMinimumAmountToInvest());
			projectVo.setProjectCategory(project.getProjectCategory());
			projectVo.setProjectDetails(project.getProjectDetails());
			projectVos.add(projectVo);
		}
		return projectVos;
	}

	@RequestMapping(value = "/support", method = RequestMethod.GET)
	public String support(Model model){
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * Here we will have to fill all the information in support page as follows
		 * 
		 * return support page
		 */
		return "/page/support";
	}
	
	@RequestMapping(value = "/support", method = RequestMethod.POST)
	public Boolean requestSupport(Model model,String suuportDto){
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * This is to put support information on submit
		 * when user needs any help
		 * 
		 * return support page
		 */
		return true;
	}
	
	@RequestMapping(value="/projects", method = RequestMethod.POST)
	public String investInProjects(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("beanss") InvestDto investDto) throws SQLException{
		/*investDto.setUserId(response.getRemoteUser());*/
		investService.investInProject(investDto);
		return "/page/projects";
	}
	
	@RequestMapping(value="/projectdetail", method = RequestMethod.GET)
	public String getProjectById(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "projectId", required=true) String projectId, Model model) throws SQLException{
		System.out.println(projectId);
		ProjectDto projectDto = projectService.getProjectById("P0001");
		System.out.println(projectDto.getProjectId());
		model.addAttribute("projectDto", projectDto);
		return "/page/projectList/projectdetail";
	}
	
	
	/**
	 * All page view Methods End
	 */
	
}
