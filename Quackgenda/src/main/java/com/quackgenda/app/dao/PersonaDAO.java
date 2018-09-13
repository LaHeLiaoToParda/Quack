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
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> buscarNombre(String nombre){
		
		String hql = "FROM Persona where nombre ='"+nombre+"'";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
				
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> mostrarCategoria(){
		
		String hql = "FROM Persona";
		//String hql = " FROM '"+categoria+"'";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> busquedaPersonalizada(String tabla,String elem){
		
		String hql = "FROM Persona where "+tabla+" ='"+elem+"'";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	

	@Transactional
	public List<Persona> listarTodosGroupBy(String group) {
		String hql = "FROM Persona GROUP BY " + group;
		return entityManager.createQuery(hql).getResultList();
	}

}
