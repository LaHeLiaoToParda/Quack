package com.quackgenda.app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="personas")
public class Persona{
	
//	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_persona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	@DateTimeFormat(pattern = "yyyy.MM.dd")
	private Date fecha_nacimiento;
	
	@OneToOne()
	@JoinColumn(name = "id_empleado")
	private Empleado empleado;

	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	List<Direccion> direcciones = new ArrayList<>();

	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	List<Telefono> telefonos = new ArrayList<>();

	
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	//constructores//////////////////
	public Persona() {	
	}
	public Persona(int id_persona, String nombre, String apellido1, String apellido2, String dni, Date fecha_nacimiento) {
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	//getters y setters/////////////////
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	//metodos////////////////////
	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fecha_nacimiento=" + fecha_nacimiento + "empleado=" + empleado + "]";
	}
	
	
}
