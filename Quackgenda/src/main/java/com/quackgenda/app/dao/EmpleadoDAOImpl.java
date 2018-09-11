package com.quackgenda.app.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.quackgenda.app.model.Persona;


@Repository
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
		
		String query = "FROM PERSONAS";
		
		return (List<Persona>) entityManager.createQuery(query).getResultList();
	}

	
	@Override
	@Transactional
	public Persona fichaTecnica(int idPersonas) {
		String query="FROM PERSONAS WHERE idPersonas"+idPersonas;
		return (Persona) entityManager.createQuery(query).getResultList();
	}

}
