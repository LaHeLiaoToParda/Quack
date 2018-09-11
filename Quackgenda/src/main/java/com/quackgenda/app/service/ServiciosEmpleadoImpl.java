package com.quackgenda.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quackgenda.app.dao.IEmpleadoDAO;
import com.quackgenda.app.model.Empleado;

@Service
@Transactional
public class ServiciosEmpleadoImpl implements IServiciosEmpleado{
	
	@Autowired
	private IEmpleadoDAO userDAO;

	
	public List<Empleado> listadoEmpleado() {
		
		return userDAO.listadoEmpleado();
	}

	
	public Empleado fichaTecnica(int idEmpleados) {
		
		return userDAO.fichaTecnica(idEmpleados);
	}
	
	

}
