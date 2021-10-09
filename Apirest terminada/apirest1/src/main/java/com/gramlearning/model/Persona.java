package com.gramlearning.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Persona {
	
	@Id
	private Long id;
	
	private String nombre;
	private String usuario;
	private Date fecha;
	
	public Persona() {
	}
	public Persona(Long id, String nombre, String usuario, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.fecha = fecha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", fecha=" + fecha + "]";
	}
	
	
}
