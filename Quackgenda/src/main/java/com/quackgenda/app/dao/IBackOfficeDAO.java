package com.quackgenda.app.dao;

import com.quackgenda.app.model.Persona;

public interface IBackOfficeDAO {

	public Persona consultarPersona(int dni);

	public void eliminiarPersona(int dni);

}
