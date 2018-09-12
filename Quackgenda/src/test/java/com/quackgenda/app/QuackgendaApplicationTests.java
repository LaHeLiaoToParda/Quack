package com.quackgenda.app;


import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.quackgenda.app.dao.PersonaDAO;
import com.quackgenda.app.model.Persona;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class QuackgendaApplicationTests {
	
	@Autowired
	private PersonaDAO personaDao;

	//Prueba unitaria para el método listarTodos()
	@Test
	public void listarTodo() {
		
		List<Persona> list = personaDao.listarTodos();
		
		Assert.assertNotNull("Prueba listarTodos", list);
	
		
	}
	
	@Test
	public void buscarPersona() {
		Persona lis = personaDao.buscarPersona(1);
		
		Assert.assertNotNull("Prueba buscarPersona", lis);
	}

}
