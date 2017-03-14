package com.empleodigital.bquiet.beans;

public class RegistroPrincipalBean {
	
	private int id;
	private int id_usuario;
	private int media;
	private String fecha;
	
	public RegistroPrincipalBean() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "RegistroPrincipalBean [id=" + id + ", id_usuario=" + id_usuario + ", media=" + media + ", fecha="
				+ fecha + "]";
	}
	
}
