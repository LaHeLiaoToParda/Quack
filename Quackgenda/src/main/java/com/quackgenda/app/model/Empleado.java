package com.quackgenda.app.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_empleado;
	private String cod_empleado;
	private String salario;
	@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
	private Date fecha_alta;
	private String imagen_empleado;
	
	@OneToOne(mappedBy = "empleado")
	private Persona persona;
	
	@OneToOne()
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@OneToOne()
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;
	
	
	
	//constructores///////////////////////
	public Empleado(){
		
	}
	public Empleado(int id_empleado, String cod_empleado, String salario, Date fecha_alta, String imagen_empleado) {
		this.id_empleado = id_empleado;
		this.cod_empleado = cod_empleado;
		this.salario = salario;
		this.fecha_alta = fecha_alta;
		this.imagen_empleado = imagen_empleado;
	}
	
	
	//getters y setters///////////////////
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getCod_empleado() {
		return cod_empleado;
	}
	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public String getImagen_empleado() {
		return imagen_empleado;
	}
	public void setImagen_empleado(String imagen_empleado) {
		this.imagen_empleado = imagen_empleado;
	}
	
	
	//metodos//////////////////
	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", cod_empleado=" + cod_empleado + ", salario=" + salario
				+ ", fecha_alta=" + fecha_alta + ", imagen_empleado=" + imagen_empleado + ", categoria=" + categoria + ", departamento=" + departamento + "]";
	}
	
}
