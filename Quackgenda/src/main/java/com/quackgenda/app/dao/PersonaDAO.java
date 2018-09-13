package com.quackgenda.app.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.quackgenda.app.model.Persona;

@Repository
public class PersonaDAO implements IPersonaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public PersonaDAO() {
		
	}
	
	@Transactional
	public List<Persona> listarTodos() {
		String hql = "FROM Persona";
		return  entityManager.createQuery(hql).getResultList();
	}
	
	@Transactional
	public Persona buscarPersona(int id) {
		String hql = "FROM Persona WHERE id_persona="+id;
		return (Persona) entityManager.createQuery(hql).getResultList().get(0);
	}

	@Transactional
	public List<Persona> listarTodosGroupBy(String group) {
		String hql = "FROM Persona GROUP BY " + group;
		return entityManager.createQuery(hql).getResultList();
	}

}
