package com.quackgenda.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {

	private int idCategorias;
	private String nombre;
	private String descripcion;

	public Categoria() {
		super();
	}

	public Categoria(int idCategorias, String nombre, String descripcion) {
		super();
		this.idCategorias = idCategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue
	@Column(name = "IDCATEGORIAS")
	public int getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(int idCategorias) {
		this.idCategorias = idCategorias;
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

	@Override
	public String toString() {
		return "Categoria [idCategorias=" + idCategorias + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
