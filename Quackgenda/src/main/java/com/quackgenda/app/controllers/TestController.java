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
import com.quackgenda.app.services.IServiciosEmpleado;
 
@Controller
public class TestController {
 
	@Autowired
	private IServiciosEmpleado serviciosEmpleado;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value="welcome", method = RequestMethod.GET)
	public ModelAndView welcome() throws Exception {
		logger.info("-- en welcome.jsp");
		ModelAndView model = new ModelAndView("welcome");
		return model;
	}
	
	@RequestMapping(value="welcome#1", method = RequestMethod.GET)
	public ModelAndView listar() throws Exception {
		logger.info("-- en listado.jsp");
//		List<Persona>listaEmpleados = serviciosEmpleado.listadoEmpleado();
		ModelAndView model = new ModelAndView("listado");
//		model.addObject("listaEmple", listaEmpleados);
		return model;
	}
	
	@RequestMapping(value="UserList", method = RequestMethod.GET)
	public ModelAndView test() throws Exception {
		logger.info("-- Pagina Principal");
		List<Persona>listaEmpleados = serviciosEmpleado.listadoEmpleado();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("lista", listaEmpleados);
		return model;

	}	
}
