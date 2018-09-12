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
@Table(name = "direcciones")
public class Direccion {


	@Id
	@GeneratedValue
	private int id_direccion;

	private String direccion;

	private String cod_postal;

	private String localidad;

	private String provincia;

//	private int id_persona;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	
	
	
	
	

	public Direccion() {
		super();
	}

	
	
	public Direccion(int id_direccion, String direccion, String cod_postal, String localidad, String provincia
			) {
		super();
		this.id_direccion = id_direccion;
		this.direccion = direccion;
		this.cod_postal = cod_postal;
		this.localidad = localidad;
		this.provincia = provincia;
	}


	public int getId_direccion() {
		return id_direccion;
	}



	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCod_postal() {
		return cod_postal;
	}



	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
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






	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	@Override
	public String toString() {
		return "Direccion [id_direccion=" + id_direccion + ", direccion=" + direccion + ", cod_postal=" + cod_postal
				+ ", localidad=" + localidad + ", provincia=" + provincia + ", persona="
				+ persona + "]";
	}



	
	

	

}
