package com.quackgenda.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefonos")
public class Telefono {



	@Id
	@GeneratedValue
	private int id_telefono;
	private String telefono;
//	private int id_persona;

	public Telefono() {
		super();
	}

	

	public Telefono(int id_telefono, String telefono, Persona persona) {
		super();
		this.id_telefono = id_telefono;
		this.telefono = telefono;
		this.persona = persona;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_persona")
	private Persona persona;

	
	
	public int getId_telefono() {
		return id_telefono;
	}
	public void setId_telefono(int id_telefono) {
		this.id_telefono = id_telefono;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}






	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	@Override
	public String toString() {
		return "Telefono [id_telefono=" + id_telefono + ", telefono=" + telefono
				+ ", persona=" + persona + "]";
	}

	
	

}
