package com.quackgenda.app.model;

public class Direccion {

	private int idDirecciones;
	private String direccion;
	private String codPostal;
	private String localidad;
	private String provincia;
	private int idPersona;

	public Direccion() {
		super();
	}

	public Direccion(int idDirecciones, String direccion, String codPostal, String localidad, String provincia,
			int idPersona) {
		super();
		this.idDirecciones = idDirecciones;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.idPersona = idPersona;
	}

	public int getIdDirecciones() {
		return idDirecciones;
	}

	public void setIdDirecciones(int idDirecciones) {
		this.idDirecciones = idDirecciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Direccion [idDirecciones=" + idDirecciones + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", localidad=" + localidad + ", provincia=" + provincia + ", idPersona=" + idPersona + "]";
	}

}