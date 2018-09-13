package com.quackgenda.app.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quackgenda.app.dao.IPersonaDAO;
import com.quackgenda.app.model.Persona;

@Service
@Transactional
public class ServiciosPersonaImpl implements IServiciosPersona {

	@Autowired
	private IPersonaDAO personaDAO;
	
	
	public List<Persona> listarTodos() {
		return personaDAO.listarTodos();
	}

	
	public Persona buscarPersona(int id) {
		return personaDAO.buscarPersona(id);
	}


	public List<Persona> listarTodosGroupBy(String group) {
		return personaDAO.listarTodosGroupBy(group);
	}
	
	public List<Persona> mostrarCategoria(){
		return personaDAO.mostrarCategoria();
	}
	
	public List<Persona> busquedaPersonalizada(String tabla,String elem){
		
		return personaDAO.busquedaPersonalizada(tabla,elem);
	}
	

	
	public List<Persona> buscarNombre(String nombre){
		
		return personaDAO.buscarNombre(nombre);
	}
	
}
