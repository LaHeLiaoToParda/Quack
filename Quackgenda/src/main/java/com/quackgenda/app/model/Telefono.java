package com.quackgenda.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONOS")
public class Telefono {

	private int idTelefonos;
	private String telefono;
	private int idPersona;

	public Telefono() {
		super();
	}

	public Telefono(int idTelefonos, String telefono, int idPersona) {
		super();
		this.idTelefonos = idTelefonos;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}

	@Id
	@GeneratedValue
	@Column(name = "IDTELEFONOS")
	public int getIdTelefonos() {
		return idTelefonos;
	}

	public void setIdTelefonos(int idTelefonos) {
		this.idTelefonos = idTelefonos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Telefono [idTelefonos=" + idTelefonos + ", telefono=" + telefono + ", idPersona=" + idPersona + "]";
	}

}
