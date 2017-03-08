package com.empleodigital.bquiet.beans;

public class Registro {
	
	private int id;
	private int media;
	private int id_usuario;
	
	public Registro() {}

	public Registro(int id, int media, int id_usuario) {
		this.id = id;
		this.media = media;
		this.id_usuario = id_usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Registro [id=" + id + ", media=" + media + ", id_usuario=" + id_usuario + "]";
	}
	
}
