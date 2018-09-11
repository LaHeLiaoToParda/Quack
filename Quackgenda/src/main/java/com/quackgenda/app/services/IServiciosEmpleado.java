package com.quackgenda.app.services;

import java.util.List;

import com.quackgenda.app.model.Persona;

public interface IServiciosEmpleado {
	
	public List<Persona> listadoEmpleado();
	
	Persona fichaTecnica(int idPersonas);
	

}
