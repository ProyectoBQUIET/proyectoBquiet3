package com.empleodigital.bquiet.beans;

import java.util.ArrayList;

public class ListaRegistroBean {
	
	private ArrayList<RegistroBean> registros;

	public ListaRegistroBean(ArrayList<RegistroBean> registros) {
		this.registros = registros;
	}

	public ArrayList<RegistroBean> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<RegistroBean> registros) {
		this.registros = registros;
	}

	@Override
	public String toString() {
		return "ListaRegistroBean [registros=" + registros + "]";
	}


	
}
