package com.empleodigital.bquiet.beans;

public class RegistroBean {
	
	private String date;
	private String value;
	
	public RegistroBean(String date, String value) {
		this.date = date;
		this.value = value;
	}
	
	public RegistroBean() {}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RegistroBean [date=" + date + ", value=" + value + "]";
	}
	
	
	
	

}
