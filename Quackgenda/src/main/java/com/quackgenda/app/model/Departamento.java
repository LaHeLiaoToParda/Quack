package com.quackgenda.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_departamento;
	private String nombre;
	
	@OneToOne(mappedBy = "departamento")
	private Empleado empleado;

	
	//construtores/////////////////////
	public Departamento() {
		
	}
	public Departamento(int id_departamento, String nombre) {
		super();
		this.id_departamento = id_departamento;
		this.nombre = nombre;
	}
	
	
	//getters y setters////////////////
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//metodos///////////////////////////
	@Override
	public String toString() {
		return "Departamento [id_departamento=" + id_departamento + ", nombre=" + nombre + "]";
	}
}
