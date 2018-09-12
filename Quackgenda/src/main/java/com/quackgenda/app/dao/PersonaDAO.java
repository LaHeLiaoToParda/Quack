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

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> listarTodos() {
		String hql = "FROM Persona";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> buscarPersona(int id_persona) {
		String hql = "FROM Persona where id_persona="+id_persona;
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

}
