package com.quackgenda.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiciosEmpleadoImpl implements IServiciosEmpleado{
	
	private IServiciosEmpleado datos = new ServiciosEmpleadoImpl();

	
	public List<Empleado> listadoEmpleado() {
		
		return null;
	}

	
	public Empleado fichaTecnica(int idEmpleados) {
		
		return null;
	}
	
	

}
