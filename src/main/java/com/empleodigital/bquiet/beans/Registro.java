package com.empleodigital.bquiet.beans;

public class Registro {
	
	private int id;
	private String fecha;
	private String hora;
	private int media;
	private int valor;
	private int id_usuario;
	
	public Registro() {}

	public Registro(int id, String fecha, String hora, int media, int valor, int id_usuario) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.media = media;
		this.valor = valor;
		this.id_usuario = id_usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Registro [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", media=" + media + ", valor=" + valor
				+ ", id_usuario=" + id_usuario + "]";
	}
	
}
