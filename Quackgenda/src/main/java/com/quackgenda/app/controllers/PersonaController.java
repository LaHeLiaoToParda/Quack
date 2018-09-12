package com.quackgenda.app.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.quackgenda.app.model.Persona;
import com.quackgenda.app.services.IServiciosPersona;

@Controller
public class PersonaController {

	@Autowired
	private IServiciosPersona serviciosPersona;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonaController.class);
	
	@RequestMapping(value="welcome", method=RequestMethod.GET)
	public ModelAndView welcome() throws Exception {
		logger.info("-- en welcome()");
		ModelAndView model = new ModelAndView("welcome");
		return model;
	}
	
	@RequestMapping(value="empleados", method=RequestMethod.GET)
	public ModelAndView listarPersonas() throws Exception {
		logger.info("-- en listarEmpleados()");
		ModelAndView model = new ModelAndView("test");
		
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		
		return model;
	}
	
	@RequestMapping(value="/listaEmpleados", method=RequestMethod.GET)
	public ModelAndView welcome2() throws Exception {
		logger.info("-- en listarEmpleados()");
		ModelAndView model = new ModelAndView("listadoEmpleados");
		
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		return model;
	}
	
	@RequestMapping(value="/Busqueda", method=RequestMethod.GET)
	public ModelAndView busquedaCategoria() throws Exception {
		logger.info("-- en listarEmpleados()");
		ModelAndView model = new ModelAndView("listadoEmpleados");
		
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		return model;
	}
	
}
