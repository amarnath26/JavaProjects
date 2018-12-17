package com.amar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
	@RequestMapping("/")
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView("Hello");

		model.addObject("msg", "Welcome to Java World");
		return model;

	}

}
