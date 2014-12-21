package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController  {

	@RequestMapping(value="/ExpediaDeals")
	public ModelAndView getHelloWorld(){
		System.out.println("Reuquest Mapped !!!!!!");
		ModelAndView model = new ModelAndView("HelloWorldPage");
		System.out.println("returned model object !!!!!!!!!!");
		return model;
	}

}