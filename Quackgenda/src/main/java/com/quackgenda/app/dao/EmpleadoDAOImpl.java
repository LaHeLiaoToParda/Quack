package com.quackgenda.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.quackgenda.app.model.Persona;

public class EmpleadoDAOImpl implements IEmpleadoDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	
	
	public EmpleadoDAOImpl(){
		super();
	}


	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Persona> listadoEmpleado() {
		
		String query = "FROM personas;";
		
		return (List<Persona>) entityManager.createQuery(query).getResultList();
	}

	
	public Persona fichaTecnica(int idPersonas) {
		String query="FROM personas WHERE idPersonas"+idPersonas+"";
		return (Persona) entityManager.createQuery(query).getResultList();
	}

}
