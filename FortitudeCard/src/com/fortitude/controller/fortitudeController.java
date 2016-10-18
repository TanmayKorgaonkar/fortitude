package com.fortitude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class fortitudeController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hi there, this website is still under construction</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
