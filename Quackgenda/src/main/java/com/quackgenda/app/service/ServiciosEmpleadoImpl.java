package com.quackgenda.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.quackgenda.app.model.Empleado;

@Service
@Transactional
public class ServiciosEmpleadoImpl implements IServiciosEmpleado{
	
	private IServiciosEmpleado datos = new ServiciosEmpleadoImpl();

	
	public List<Empleado> listadoEmpleado() {
		
		return datos.listadoEmpleado();
	}

	
	public Empleado fichaTecnica(int idEmpleados) {
		
		return datos.fichaTecnica(idEmpleados);
	}
	
	

}
