package com.quackgenda.app.services;

import com.quackgenda.app.model.Persona;

public interface IBackOfficeService {
	
	public Persona consultarPersona(int dni);
	
	public void eliminiarPersona(int dni);

}
