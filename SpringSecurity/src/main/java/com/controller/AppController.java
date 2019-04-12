package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView sayHello()
	{
		return new ModelAndView("welcomePage");
	}
	
	@RequestMapping(value="/loginPage",method=RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value="error",required=false)String error,
			@RequestParam(value="logout",required=false)String logout)
	{
		 ModelAndView model = new ModelAndView();
		 if(error != null){
			 model.addObject("error", "Invalid Credentials provided");
			 model.setViewName("loginPage");
			 return model;
		 }
		 
		 else if(logout != null){
			 model.addObject("logout", "Logged Out Successfully");
			 model.setViewName("loginPage");
			 return model;
		 }
		 
		 else if(error == null && logout == null){
			 return new ModelAndView("loginPage");
		 }
		 
		 return new ModelAndView("success");
	}	
	
	@RequestMapping("/success")
	public ModelAndView success()
	{
		return new ModelAndView("success");
	}

}
