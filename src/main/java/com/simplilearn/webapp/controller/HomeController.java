package com.simplilearn.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/status")
	public ModelAndView indexMapper() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("data","Spring Mvc Server");
		mv.addObject("message","Spring is up & running !");
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView helloMapper(@RequestParam(value="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("data",username);
		mv.addObject("message","Spring is up & running !");
		return mv;
	}
	
	
	@RequestMapping("/response")
	public ModelAndView responseMapper(@RequestParam(value="message") String message) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("data","Sample Data");
		mv.addObject("message",message);
		return mv;
	}

}
