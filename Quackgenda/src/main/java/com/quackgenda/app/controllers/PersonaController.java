package com.quackgenda.app.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	
	//metodo para el "backoffice" listar empleados
	@RequestMapping(value="empleados", method=RequestMethod.GET)
	public ModelAndView empleadosTabla() throws Exception {
		logger.info("-- en empleadosTabla()");
		ModelAndView model = new ModelAndView("test");
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		return model;
	}
	
	//metodo para listar todos los empleados
	@RequestMapping(value="listaEmpleados", method=RequestMethod.GET)
	public ModelAndView listarEmpleados() throws Exception {
		logger.info("-- en listarEmpleados()");
		ModelAndView model = new ModelAndView("listadoEmpleados");
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		return model;
	}
	
	//metodo para listar todos los empleados agrupados
		@RequestMapping(value="listaEmpleadosGroup", method=RequestMethod.GET)
		public ModelAndView listarEmpleadosGroupBy(HttpServletRequest request) throws Exception {
			logger.info("-- en listarEmpleados()");
			ModelAndView model = new ModelAndView("listadoEmpleados");
			String group = request.getParameter("group");
			List<Persona>listaPersonas = serviciosPersona.listarTodosGroupBy(group);
			model.addObject("lista",listaPersonas);
			return model;
		}
	
	//metodo busqueda
	@RequestMapping(value="busqueda", method=RequestMethod.GET)
	public ModelAndView busquedaCategoria() throws Exception {
		logger.info("-- en listarEmpleados()");
		ModelAndView model = new ModelAndView("listadoEmpleados");
		List<Persona>listaPersonas = serviciosPersona.listarTodos();
		model.addObject("lista",listaPersonas);
		return model;
	}
	
	//metodo para mostrar la ficha tecnica
	@RequestMapping(value="fichaTecnica", method=RequestMethod.GET)
	public ModelAndView fichaTecnica(HttpServletRequest request) throws Exception {
  		logger.info("-- en fichaTecnica()");
  		ModelAndView model = new ModelAndView("fichaTecnica");
  		int personaId = Integer.parseInt(request.getParameter("personaId"));
  		Persona persona = serviciosPersona.buscarPersona(personaId);
  		model.addObject("persona",persona);
		return model;
		
	//metodo para recoger texto de la barra y buscarlo en la base de datos
	}@RequestMapping(value="/BarraBusqueda", method=RequestMethod.GET)
	public ModelAndView busquedaCategoria(HttpServletRequest request) throws Exception {
		logger.info("-- en listarEmpleados()");
		String busqueda = request.getParameter("search");
		ModelAndView model = new ModelAndView("listadoEmpleados");
		
		List<Persona>listaPersonas = serviciosPersona.buscarNombre(busqueda);
		model.addObject("lista",listaPersonas);
		return model;
	}
	
	@RequestMapping(value="/RecogerSelect", method=RequestMethod.GET)
	public ModelAndView select(HttpServletRequest request) throws Exception {
		logger.info("-- en select()");
		String busqueda = request.getParameter("opc");
		
		ModelAndView model = new ModelAndView("selector");
		
	
		request.setAttribute("titulo", busqueda); 
		List<Persona>listaNombreCategoria = serviciosPersona.mostrarCategoria();
		model.addObject("lista",listaNombreCategoria);
		
		
		
		
		
		return model;
	}
	
	
	@RequestMapping(value="/RealizarConsulta", method=RequestMethod.GET)
	public ModelAndView select2(HttpServletRequest request) throws Exception {
		logger.info("-- en select()");
		
		String busqueda = request.getParameter("opc1");
		String busqueda2 = request.getParameter("opc2");
		System.out.println("*************"+busqueda+"***************************"+busqueda2);
		ModelAndView model = new ModelAndView("listadoEmpleados");
		
		List<Persona>lista = serviciosPersona.busquedaPersonalizada("nombre",busqueda2);
		model.addObject("lista",lista);
	
		return model;
	}
	
	
}
