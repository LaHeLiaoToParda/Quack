package com.quackgenda.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_categoria;
	private String nombre;
	private String descripcion;
	
	@OneToOne(mappedBy = "categoria")
	private Empleado empleado;
	
	
	//constructores///////////////////////
	public Categoria() {
	}
	public Categoria(int id_categoria, String nombre, String descripcion) {
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	//getters y setters////////////////////
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//metodos/////////////////////////////
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
