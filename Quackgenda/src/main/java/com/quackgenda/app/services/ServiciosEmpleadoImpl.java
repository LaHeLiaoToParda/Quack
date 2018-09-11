package com.quackgenda.app.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quackgenda.app.dao.IEmpleadoDAO;
import com.quackgenda.app.model.Persona;

@Service
@Transactional
public class ServiciosEmpleadoImpl implements IServiciosEmpleado{
	
	@Autowired
	private IEmpleadoDAO empleadoDAO;

	@Override
	public List<Persona> listadoEmpleado() {
		
		return empleadoDAO.listadoEmpleado();
	}

	
	public Persona fichaTecnica(int idPersonas) {
		
		return empleadoDAO.fichaTecnica(idPersonas);
	}
	
	

}
