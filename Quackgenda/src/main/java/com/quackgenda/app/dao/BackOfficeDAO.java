package com.quackgenda.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.quackgenda.app.model.Persona;

@Repository
public class BackOfficeDAO implements IBackOfficeDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public BackOfficeDAO() {
		
	}

	@Transactional
	public Persona consultarPersona(int dni) {
		String hql = "FROM Persona WHERE dni="+dni;
		return (Persona) entityManager.createQuery(hql).getResultList().get(0);
	}

	@Transactional
	public void eliminiarPersona(int dni) {
		String hql = "DELETE Persona WHERE dni="+dni;
		entityManager.createQuery(hql);
	}

}
