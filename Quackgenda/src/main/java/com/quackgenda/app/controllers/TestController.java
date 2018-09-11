package com.quackgenda.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class TestController {
 
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("/welcome")
	public ModelAndView handleRequest() throws Exception {
		logger.info("-- en welcome");		
		ModelAndView model = new ModelAndView("testJSP");
		model.addObject("mensajeTest", "test de prueba");
		return model;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView loadTest() throws Exception {
		logger.info("-- en /welcome");		
		ModelAndView model = new ModelAndView("welcome");
//		model.addObject("mensajeTest", "test de prueba");
		return model;
	}
	
}
