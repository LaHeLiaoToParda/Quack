package com.quackgenda.app.dao;

import java.util.List;
import com.quackgenda.app.model.Persona;

public interface IPersonaDAO {

	List<Persona> listarTodos();

	Persona buscarPersona(int id);

	List<Persona> buscarNombre(String nombre);
	
	List<Persona> mostrarCategoria();
	

	
    List<Persona> busquedaPersonalizada(String tabla,String elem);
    
	List<Persona> listarTodosGroupBy(String group);
}
