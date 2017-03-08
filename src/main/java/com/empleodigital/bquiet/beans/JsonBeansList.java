package com.empleodigital.bquiet.beans;

import java.util.Arrays;

public class JsonBeansList {
	private JsonBean[] lista;
	
	public JsonBeansList(){}

	public JsonBean[] getLista() {
		return lista;
	}

	public void setLista(JsonBean[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "[lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	
}
