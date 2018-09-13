package com.quackgenda.app;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.quackgenda.app.dao.BackOfficeDAO;
import com.quackgenda.app.dao.PersonaDAO;
import com.quackgenda.app.model.Persona;



@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class QuackgendaApplicationTests {
	
	@Autowired
	private PersonaDAO personaDao;
	
	@Autowired
	private BackOfficeDAO personaBackOfficeDAO;

	//Prueba unitaria para el método listarTodos()
	@Test
	public void listarTodo() {
		
		List<Persona> list = personaDao.listarTodos();
		
		Assert.assertNotNull("Error listado", list);
	
		
	}
	//Prueba unitaria para el método buscarPersona()
	@Test
	public void buscarPersona() {
		Persona lis = personaDao.buscarPersona(1);
	
		Assert.assertNotNull("Error buscarPersona", lis);
	}
	//Prueba unitaria para el método consultarPersona()
	@Test
	public void consultarPersona(){
		
		
		Persona p = personaBackOfficeDAO.consultarPersona("123");
		
		Assert.assertNotNull("Error al consultar persona", p);

	}

}
