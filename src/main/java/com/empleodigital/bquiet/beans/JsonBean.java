package com.empleodigital.bquiet.beans;

public class JsonBean {
	
	private String date;
	private int value;
	
	public JsonBean() {
		this.date = "DATE";
		this.value = 10;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
		return "JsonBean [date=" + date + ", value=" + value + "]";
	}
	
}
