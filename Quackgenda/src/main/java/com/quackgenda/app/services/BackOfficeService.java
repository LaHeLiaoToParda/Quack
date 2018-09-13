package com.quackgenda.app.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quackgenda.app.dao.IBackOfficeDAO;
import com.quackgenda.app.model.Persona;


@Service
@Transactional
public class BackOfficeService implements IBackOfficeService{
	
	@Autowired
	private IBackOfficeDAO BackOfficeDAO;

	
	public Persona consultarPersona(int dni) {
		
		return BackOfficeDAO.consultarPersona(dni);
	}


	public void eliminiarPersona(int dni) {
		
		BackOfficeDAO.eliminiarPersona(dni);
	}
	
	
	
	

}
