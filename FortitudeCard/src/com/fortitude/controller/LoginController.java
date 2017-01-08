package com.fortitude.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;


import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.fortitude.delegate.LoginDelegate;
import com.fortitude.dto.AccountDto;
import com.fortitude.dto.LoginDto;

@Controller
@RequestMapping("/fortitudeLogin")
public class LoginController {
	@Autowired
	private LoginDelegate loginDelegate;
	
	@Autowired
	@Qualifier("formValidator")
	private Validator validator;
	
	@RequestMapping(value="/fortitudeLogin", method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("fortitudeLogin");
		LoginDto loginDto = new LoginDto(); 
		model.addObject("loginBean", loginDto);
		return model;
	}
	@RequestMapping(value="/fortitudeLogin", method=RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginDto loginDto){
		ModelAndView model = null;
		if(request.equals("SignUp")){
			System.out.println("signup button is clicked");
		}
		try{
			boolean isValidUser = loginDelegate.isValidAccount(loginDto.getId(), loginDto.getPassword());
			if(isValidUser){
				System.out.println("login successfull");
				request.setAttribute("loggedInUser", loginDto.getId());
				model = new ModelAndView("account");
			}else{
				model = new ModelAndView("fortitudeLogin");
				model.addObject("loginBean", loginDto);
				request.setAttribute("message", "invalidCredentials");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return model;
	}
	
	@InitBinder("form")
	private void initBinder(WebDataBinder binder){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/signUp",method = RequestMethod.GET)
	public String initForm(Map<String, Object> model){
		AccountDto signUp = new AccountDto();
		model.put("signUp", signUp);
		List<String> genderList = new ArrayList<>();
		genderList.add("F");
		genderList.add("M");
		model.put("genderList", genderList);
		List<String> userRoleList = new ArrayList<>();
		userRoleList.add("User");
		userRoleList.add("Investor");
		model.put("userRole", userRoleList);
		//model.addAttribute("signUp", signUp);
	//	initModelList(model);
		return "/signUp";
	}
	
	@RequestMapping(value="/mainLayout",method = RequestMethod.GET)
	public String mainLayout(Model model){
		
		return "/page/home";
	}
	
	@RequestMapping(value="/signUp",method = RequestMethod.POST)
	public String submitForm(Model model, @Validated AccountDto form, BindingResult result) throws SQLException{
		model.addAttribute("form",form);
		String returnValue = "successForm";
		if(result.hasErrors()){
		//	initModelList(model);
			returnValue = "/homepage";
		}else{
			loginDelegate.signupUser(form);
		}
		return returnValue;
	}
	
	/*private void initModelList(Map<String, Object> model){
		List<String> userRoles = new ArrayList<>();
		userRoles.add("User");
		userRoles.add("Investor");
		model.addAttribute(userRoles);
	}*/
	
}
