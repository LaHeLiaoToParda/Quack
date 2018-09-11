package com.quackgenda.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONOS")
public class Telefono {

	@Column(name = "IDTELEFONOS")
	private int idTelefonos;
	private String telefono;
	private int idPersonas;

	public Telefono() {
		super();
	}

	public Telefono(int idTelefonos, String telefono, int idPersona) {
		super();
		this.idTelefonos = idTelefonos;
		this.telefono = telefono;
		this.idPersonas = idPersona;
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

	@Column(name = "IDPERSONAS")
	public int getIdPersona() {
		return idPersonas;
	}

	public void setIdPersona(int idPersonas) {
		this.idPersonas = idPersonas;
	}

	@Override
	public String toString() {
		return "Telefono [idTelefonos=" + idTelefonos + ", telefono=" + telefono + ", idPersona=" + idPersonas + "]";
	}

}
