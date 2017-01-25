package com.fortitude.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.fortitude.vo.ChartVo;
import com.fortitude.vo.InvestmentVo;
import com.google.gson.Gson;
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
		
		List<ProjectDto> projects = projectService.getAllProject();
		model.addAttribute("projects", projects);
		
		return "/page/projects";
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
		ProjectDto projectDto = projectService.getProjectById(projectId);
		System.out.println(projectDto.getProjectId());
		model.addAttribute("projectDto", projectDto);
		return "/page/projectList/projectdetail";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/transaction", method = RequestMethod.GET)
	public String getProjectById(HttpServletRequest request, HttpServletResponse response, Model model) throws SQLException, IOException{
		String userId = request.getRemoteUser();
		List<InvestDto> investDtoList = investService.getInvestByUser(userId);
		// Need to use proper stream
	//	Map<Integer, List<Long>> investmentDateList = new HashMap<>();
		Map<Integer, List<InvestDto>> investmentDateList = investDtoList.stream().collect(Collectors.groupingBy((f -> (Integer)f.getDateOfInvestment().getMonth())));
		System.out.println(investmentDateList);
		/*investDtoList.stream().forEach(f ->{*/
		/*	
			if(!investmentDateList.containsKey(f.getDateOfInvestment().getMonth())){
			investmentDateList.put(f.getDateOfInvestment().getMonth(), Arrays.asList(f.getInvestmentAmount()));
			}else{
				List<Long> newList = investmentDateList.get(f.getDateOfInvestment().getMonth());
				newList.add(f.getInvestmentAmount());
			}
		});*/
		Map<Integer, Long> toChartVo = investmentDateList.entrySet()
				.stream().collect(Collectors.groupingBy(Entry::getKey, 
						Collectors.summingLong(t -> t.getValue().stream().map(p -> p.getInvestmentAmount()).collect(Collectors.summingLong(f -> f.longValue())))));
		System.out.println(toChartVo);
		/*investmentDateList.entrySet().forEach(f -> {
			long count = f.getValue().stream().mapToLong(z -> z.intValue()).sum();
			toChartVo.put(f.getKey(), count);
		});*/
		ChartVo chartVo = new ChartVo();
		List<String> legendList = new ArrayList<>();
		List<Long> valuesList = new ArrayList<>();
		toChartVo.entrySet().stream().forEach(f ->{
			legendList.add(f.getKey().toString());
			valuesList.add(f.getValue());
		});
		Map<String, List<Long>> toBeConverted = new HashMap<>();
		toBeConverted.put("data", valuesList);
		String toJson = getToJson(toBeConverted);
		chartVo.setLegend(toJson);
		chartVo.setValues(valuesList);
		System.out.println(valuesList);
		Gson gson = new Gson();
		response.setContentType("application/json;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		String jsonData = "";
		try{
			String jsonp = request.getParameter("jsonp");
			jsonData = generateJsonChartYearWise(jsonp, toChartVo);
			out.print(jsonData);
		}catch(JSONException e){
			e.printStackTrace();
		}finally{
			out.close();
		}
		/*String jsonD = gson.toJson(valuesList);

		String jsonp = request.getParameter("jsonp");*/
		
		
		model.addAttribute("chartVo", chartVo);
		return "/page/userhistory/transaction";
	}
	
	@RequestMapping(value="/transactions", method = RequestMethod.GET)
	public void generateGet(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
		String userId = request.getRemoteUser();
		List<InvestDto> investDtoList = investService.getInvestByUser(userId);
		// Need to use proper stream
	//	Map<Integer, List<Long>> investmentDateList = new HashMap<>();
		Map<Integer, List<InvestDto>> investmentDateList = investDtoList.stream().collect(Collectors.groupingBy((f -> (Integer)f.getDateOfInvestment().getMonth())));
		System.out.println(investmentDateList);
		/*investDtoList.stream().forEach(f ->{*/
		/*	
			if(!investmentDateList.containsKey(f.getDateOfInvestment().getMonth())){
			investmentDateList.put(f.getDateOfInvestment().getMonth(), Arrays.asList(f.getInvestmentAmount()));
			}else{
				List<Long> newList = investmentDateList.get(f.getDateOfInvestment().getMonth());
				newList.add(f.getInvestmentAmount());
			}
		});*/
		Map<Integer, Long> toChartVo = investmentDateList.entrySet()
				.stream().collect(Collectors.groupingBy(Entry::getKey, 
						Collectors.summingLong(t -> t.getValue().stream().map(p -> p.getInvestmentAmount()).collect(Collectors.summingLong(f -> f.longValue())))));
		System.out.println(toChartVo);
		/*investmentDateList.entrySet().forEach(f -> {
			long count = f.getValue().stream().mapToLong(z -> z.intValue()).sum();
			toChartVo.put(f.getKey(), count);
		});*/
		ChartVo chartVo = new ChartVo();
		List<String> legendList = new ArrayList<>();
		List<Long> valuesList = new ArrayList<>();
		toChartVo.entrySet().stream().forEach(f ->{
			legendList.add(f.getKey().toString());
			valuesList.add(f.getValue());
		});
		Map<String, List<Long>> toBeConverted = new HashMap<>();
		toBeConverted.put("data", valuesList);
		String toJson = getToJson(toBeConverted);
		chartVo.setLegend(toJson);
		chartVo.setValues(valuesList);
		System.out.println(valuesList);
		Gson gson = new Gson();
		response.setContentType("application/json;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		String jsonData = "";
		try{
			String jsonp = request.getParameter("jsonp");
			jsonData = generateJsonChartYearWise(jsonp, toChartVo);
			out.print(jsonData);
		}catch(JSONException e){
			e.printStackTrace();
		}finally{
			out.close();
		}
		/*String jsonD = gson.toJson(valuesList);

		String jsonp = request.getParameter("jsonp");
		
		
		model.addAttribute("chartVo", chartVo);
		return "/page/userhistory/transaction";*/
	}
	
	
	public String generateJsonChartYearWise(String jsonp, Map<Integer, Long> toChartVo) throws JSONException{
		String chartType = jsonp;
		System.out.println(chartType);
		JSONObject finalJsonObject = new JSONObject();
		
		JSONArray chartData = new JSONArray();
		JSONArray xaxisArray = new JSONArray();
		
		JSONObject xaxisObject = new JSONObject();
		JSONObject dataObject = new JSONObject();
		
		JSONArray allMonthsInterestGained = new JSONArray();
		
		toChartVo.entrySet()
		.stream().forEach(f -> {
			xaxisArray.put(f.getKey());
			allMonthsInterestGained.put(f.getValue());
		});
		xaxisObject.put("category", xaxisArray);
		chartData.put(xaxisObject);
		
		dataObject = new JSONObject();
		dataObject.put("name", "Interest gained by month");
		dataObject.put("color", "#FF0000");
		dataObject.put("data", allMonthsInterestGained);
		
		chartData.put(dataObject);
		
		System.out.println("Chart Data" + chartData);
		finalJsonObject.put(chartType, chartData);
		String resultString = jsonp+"("+finalJsonObject.toString()+")";
		return resultString;
	}
	
	String getToJson(Map<String, List<Long>> toBeConverted){
		Gson gson = new Gson();
		String json = gson.toJson(toBeConverted);
		System.out.println(json);
		return json; 
	}
	
	
	/**
	 * All page view Methods End
	 */
	
}
