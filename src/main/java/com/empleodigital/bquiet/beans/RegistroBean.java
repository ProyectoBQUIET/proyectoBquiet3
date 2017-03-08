package com.empleodigital.bquiet.beans;

public class RegistroBean {
	private int id;
	private int id_registro;
	private int date;
	private int value;
	
	public RegistroBean() {}

	public RegistroBean(int id, int id_registro, int date, int value) {
		this.id = id;
		this.id_registro = id_registro;
		this.date = date;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_registro() {
		return id_registro;
	}

	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RegistroBean [id=" + id + ", id_registro=" + id_registro + ", date=" + date + ", value=" + value + "]";
	}
	
	
}
