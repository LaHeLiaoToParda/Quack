package com.quackgenda.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.quackgenda.app.model.Empleado;

public class EmpleadoDAOImpl implements IEmpleadoDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Empleado> listadoEmpleado() {
		
		String query = "SELECT idEmpleado, nombre FROM personas;";
		
		return entityManager.createQuery(query).getResultList();
	}

	
	public Empleado fichaTecnica(int idEmpleados) {
		
		return null;
	}

}
