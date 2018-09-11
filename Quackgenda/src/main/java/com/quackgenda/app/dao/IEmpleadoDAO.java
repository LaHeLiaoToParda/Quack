package com.quackgenda.app.dao;

import java.util.List;

import com.quackgenda.app.model.Empleado;


public interface IEmpleadoDAO {
	
List<Empleado> listadoEmpleado();
	
	Empleado fichaTecnica(int idEmpleados);
	
	

}
