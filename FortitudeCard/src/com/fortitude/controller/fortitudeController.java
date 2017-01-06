package com.fortitude.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fortitude.dto.ProjectsDto;
import com.fortitude.dto.TransferDto;
import com.fortitude.service.ProjectsService;
import com.fortitude.service.TransferService;
@RequestMapping("/fortitude")
@Controller
public class fortitudeController {
	
	@Autowired
	ProjectsService projectsService;
	
	@Autowired 
	TransferService transferService;
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hi there, this website is still under construction</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	/**
	 * All page view Methods start
	 */
	
	@RequestMapping(value = "/myAccount", method = RequestMethod.GET)
	public String getAccount(Model model){
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
	public ModelAndView getProjects(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("/page/projects/addProjects");
		ProjectsDto projectsDto = new ProjectsDto();
		model.addObject("projectsBean", projectsDto);
		return model;
	}
	
	@RequestMapping(value = "/addProjects", method = RequestMethod.POST)
	public ModelAndView setProjects(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("projectsBean") ProjectsDto projectsDto) throws SQLException{
		ModelAndView model = null;
		projectsService.addProjects(projectsDto);
		model = new ModelAndView("/page/projects/addProjects");
		return model;
	}
	
	
	@RequestMapping(value = "/transferFunds", method = RequestMethod.GET)
	public ModelAndView setTransferFunds(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("transferBean") TransferDto transferDto) throws SQLException{
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		ModelAndView model = null;
		
		/**
		 * TODO
		 * return transfer page
		 */
		return new ModelAndView("");
		//return "/page/account";
	}
	
	@RequestMapping(value = "/invest", method = RequestMethod.GET)
	public String getInvest(Model model){
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * Here we will have to fill all the information in invest page as follows
		 * 	1	List of project to invest in
		 * 
		 * return invest page
		 */
		return "/page/account";
	}
	
	@RequestMapping(value = "/invest", method = RequestMethod.POST)
	public String investRequest(Model model,String investDto){
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * This is to put investment information on submit
		 * 
		 * return invest page
		 */
		return "/page/account";
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
	
	
	/**
	 * All page view Methods End
	 */
	
}
