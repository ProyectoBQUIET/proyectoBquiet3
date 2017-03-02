package com.empleodigital.bquiet.beans;

public class Registro {
	
	private int id;
	private String date;
	private int hora;
	private int minima;
	private int maxima;
	private int media;
	private int excesos;
	private int id_aula;
	private int id_curso;
	private int id_usuario;
	private int id_centro;
	
	public Registro() {}
	
	//Aqui iria el constructor que recibe paramentros

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinima() {
		return minima;
	}

	public void setMinima(int minima) {
		this.minima = minima;
	}

	public int getMaxima() {
		return maxima;
	}

	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getExcesos() {
		return excesos;
	}

	public void setExcesos(int excesos) {
		this.excesos = excesos;
	}

	public int getId_aula() {
		return id_aula;
	}

	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_centro() {
		return id_centro;
	}

	public void setId_centro(int id_centro) {
		this.id_centro = id_centro;
	}

	@Override
	public String toString() {
		return "Registros [id=" + id + ", date=" + date + ", hora=" + hora + ", minima=" + minima + ", maxima=" + maxima
				+ ", media=" + media + ", excesos=" + excesos + ", id_aula=" + id_aula + ", id_curso=" + id_curso
				+ ", id_usuario=" + id_usuario + ", id_centro=" + id_centro + "]";
	}
	
}
