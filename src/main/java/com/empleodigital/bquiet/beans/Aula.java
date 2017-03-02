package com.empleodigital.bquiet.beans;

public class Aula {
	private int id;
	private String nombre;
	private int id_centro;
	
	public Aula(){}
	
	public Aula(int id, String nombre, int id_centro) {
		this.id = id;
		this.nombre = nombre;
		this.id_centro = id_centro;
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

	public int getId_centro() {
		return id_centro;
	}

	public void setId_centro(int id_centro) {
		this.id_centro = id_centro;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", nombre=" + nombre + ", id_centro=" + id_centro + "]";
	}
	
}
