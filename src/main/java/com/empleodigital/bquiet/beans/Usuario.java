package com.empleodigital.bquiet.beans;

public class Usuario {
	private int id;
	private String nombre;
	private int tipoUsuario;
	
	public Usuario(){}
	
	public Usuario(int id, String nombre, int tipoUsuario) {
		this.id = id;
		this.nombre = nombre;
		this.tipoUsuario = tipoUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
}
