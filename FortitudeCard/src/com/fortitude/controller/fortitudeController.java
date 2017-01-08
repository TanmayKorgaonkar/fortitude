package com.fortitude.controller;

import com.fortitude.dto.ProjectDto;
import com.fortitude.service.ProjectService;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/fortitud")
@Controller
public class fortitudeController {
	
	@Autowired
	ProjectService projectService;
	
	
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
	
	
	
	
	@RequestMapping(value = "/transfer", method = RequestMethod.GET)
	public String getTransfer(Model model){
//		model.addAttribute("account", accountService.getAccount("temp-account"));
		/**
		 * TODO
		 * return transfer page
		 */
		return "/page/account";
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
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String getProjects(Model model,String investDto){
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
	
	
	/**
	 * All page view Methods End
	 */
	
}
