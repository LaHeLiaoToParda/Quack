package com.quackgenda.app.services;

import com.quackgenda.app.model.Persona;

public interface IBackOfficeService {
	
	public Persona consultarPersona(String dni);
	
	public void eliminiarPersona(String dni);
}
