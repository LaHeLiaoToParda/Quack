package com.quackgenda.app.dao;

import java.util.List;

import com.quackgenda.app.model.Persona;


public interface IEmpleadoDAO {
	
	public List<Persona> listadoEmpleado();
	
	Persona fichaTecnica(int idPersonas);
	
	

}
