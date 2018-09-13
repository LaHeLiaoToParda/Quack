package com.quackgenda.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.quackgenda.app.model.Persona;
import com.quackgenda.app.services.IBackOfficeService;

@Controller
public class BackOfficeController {
	
	@Autowired
	private IBackOfficeService serviciosBackOffice;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonaController.class);
	
	@RequestMapping(value="consulta", method=RequestMethod.GET)
	public ModelAndView consulta(HttpServletRequest request) throws Exception {
  		logger.info("-- en consulta()");
  		ModelAndView model = new ModelAndView("welcome");
  		int personaDNI = Integer.parseInt(request.getParameter("personaDNI"));
  		Persona persona = serviciosBackOffice.consultarPersona(personaDNI);
  		model.addObject("persona",persona);
		return model;
	}
	
	@RequestMapping(value="eliminar", method=RequestMethod.GET)
	public ModelAndView eliminar(HttpServletRequest request) throws Exception {
  		logger.info("-- en eliminar()");
  		ModelAndView model = new ModelAndView("welcome");
  		int personaDNI = Integer.parseInt(request.getParameter("personaDNI"));
  		serviciosBackOffice.consultarPersona(personaDNI);
		return model;
	}

}
