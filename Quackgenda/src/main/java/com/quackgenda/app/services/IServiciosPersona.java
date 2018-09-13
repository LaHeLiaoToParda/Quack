package com.quackgenda.app.services;

import java.util.List;
import com.quackgenda.app.model.Persona;

public interface IServiciosPersona {

	public List<Persona> listarTodos();
	
	public Persona buscarPersona(int id);
	
	public List<Persona> listarTodosGroupBy(String group);
	
	public List<Persona> buscarNombre(String nombre);
	
	
	public List<Persona> busquedaPersonalizada(String tabla,String elem);
	
	public List<Persona> mostrarCategoria();
	
}
