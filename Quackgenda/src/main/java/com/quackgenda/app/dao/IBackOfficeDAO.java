package com.quackgenda.app.dao;

import com.quackgenda.app.model.Persona;

public interface IBackOfficeDAO {

	public Persona consultarPersona(String dni);

	public void eliminiarPersona(String dni);

}
