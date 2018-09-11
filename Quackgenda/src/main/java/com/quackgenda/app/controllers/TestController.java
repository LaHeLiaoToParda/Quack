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
	public ModelAndView handleRequest() throws Exception {
		logger.info("-- Pagina Principal");
//		List<Persona>listEmpleados = serviciosEmpleado.listadoEmpleado();
		ModelAndView model = new ModelAndView("welcome");
//		model.addObject("listEmpleados", listEmpleados);
		return model;
	}
	
	@RequestMapping(value="testJSP", method = RequestMethod.GET)
	public ModelAndView test() throws Exception {
		logger.info("-- Pagina Principal");
		List<Persona>listaEmpleados = serviciosEmpleado.listadoEmpleado();
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("listaEmpleados", listaEmpleados);
		return model;
	}
	
	/*@RequestMapping("/welcome")
	public ModelAndView loadTest() throws Exception {
		logger.info("-- en /welcome");		
		ModelAndView model = new ModelAndView("welcome");
//		model.addObject("mensajeTest", "test de prueba");
		return model;
	}
	*/
	
}
