package com.quackgenda.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.quackgenda.app.model.Empleado;

public class EmpleadoDAOImpl implements IEmpleadoDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	
	public List<Empleado> listadoEmpleado() {
		
		return null;
	}

	
	public Empleado fichaTecnica(int idEmpleados) {
		
		return null;
	}

}
