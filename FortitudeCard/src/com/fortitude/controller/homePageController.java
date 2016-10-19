package com.fortitude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homePageController {
	
		@RequestMapping("/homepage")
		public ModelAndView helloWorld() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>This is the home page</h3></div><br><br>";
			return new ModelAndView("homepage", "message", message);
		}
	

}
