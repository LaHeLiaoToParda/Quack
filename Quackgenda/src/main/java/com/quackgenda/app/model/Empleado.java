package com.quackgenda.app.model;

import java.util.Date;

public class Empleado {

	private int idEmpleados;
	private String codEmpleado;
	private String salario;
	private Date fechaAlta;
	private int idDepartamento;
	private int idCategoria;

	public Empleado() {
		super();
	}

	public Empleado(int idEmpleados, String codEmpleado, String salario, Date fechaAlta, int idDepartamento,
			int idCategoria) {
		super();
		this.idEmpleados = idEmpleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idDepartamento = idDepartamento;
		this.idCategoria = idCategoria;
	}

	public int getIdEmpleados() {
		return idEmpleados;
	}

	public void setIdEmpleados(int idEmpleados) {
		this.idEmpleados = idEmpleados;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleados=" + idEmpleados + ", codEmpleado=" + codEmpleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + ", idDepartamento=" + idDepartamento + ", idCategoria=" + idCategoria
				+ "]";
	}

}
