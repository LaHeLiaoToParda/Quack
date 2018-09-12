package com.quackgenda.app.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quackgenda.app.dao.IPersonaDAO;
import com.quackgenda.app.model.Persona;

@Service
@Transactional
public class ServiciosPersonaImpl implements IServiciosPersona {

	@Autowired
	private IPersonaDAO personaDAO;
	
	
	public List<Persona> listarTodos() {
		return personaDAO.listarTodos();
	}

	
	public Persona buscarPersona(int id) {
		return personaDAO.buscarPersona(id);
	}

	
}
