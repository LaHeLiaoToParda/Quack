package com.quackgenda.app.services;

import java.util.List;

import com.quackgenda.app.model.Empleado;

public interface IServiciosEmpleado {
	
	List<Empleado> listadoEmpleado();
	
	Empleado fichaTecnica(int idEmpleados);
	

}
