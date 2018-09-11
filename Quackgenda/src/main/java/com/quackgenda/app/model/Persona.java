package com.quackgenda.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PERSONAS")
public class Persona {
	
	@Column(name = "IDPERSONAS")
	private int idPersonas;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	@DateTimeFormat(pattern = "yyyy.MM.dd")
	private Date fechaNacimiento;
	private int idEmpleados;
	
	public Persona() {
		super();
	}

	public Persona(int idPersonas, String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento,
			int idEmpleado) {
		super();
		this.idPersonas = idPersonas;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.idEmpleados = idEmpleado;
	}

	@Id
	@GeneratedValue
	@Column(name = "IDPERSONAS")
	public int getIdPersonas() {
		return idPersonas;
	}

	public void setIdPersonas(int idPersonas) {
		this.idPersonas = idPersonas;
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

	@Column(name = "FECHANACIMIENTO")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "IDEMPLEADOS")
	public int getIdEmpleado() {
		return idEmpleados;
	}

	public void setIdEmpleado(int idEmpleados) {
		this.idEmpleados = idEmpleados;
	}

	@Override
	public String toString() {
		return "Persona [idPersonas=" + idPersonas + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", idEmpleado=" + idEmpleados
				+ "]";
	}
	
	

}
