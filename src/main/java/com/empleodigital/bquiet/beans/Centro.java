package com.empleodigital.bquiet.beans;

public class Centro {
	private int id;
	private String nombre;
	private String provincia;
	
	public Centro(){}

	public Centro(int id, String nombre, String provincia) {
		this.id = id;
		this.nombre = nombre;
		this.provincia = provincia;
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

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Centro [id=" + id + ", nombre=" + nombre + ", provincia=" + provincia + "]";
	}
	
	
	
}
