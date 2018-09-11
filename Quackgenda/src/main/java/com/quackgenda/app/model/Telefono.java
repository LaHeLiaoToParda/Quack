package com.quackgenda.app.model;

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
