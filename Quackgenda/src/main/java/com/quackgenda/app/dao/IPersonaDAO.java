package com.quackgenda.app.dao;

import java.util.List;
import com.quackgenda.app.model.Persona;

public interface IPersonaDAO {

	List<Persona> listarTodos();

	Persona buscarPersona(int id);

	List<Persona> buscarNombre(String nombre);
	
	List<Persona> listarTodosGroupBy(String group);
}
