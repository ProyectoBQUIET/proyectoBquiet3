package com.empleodigital.bquiet.databases;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empleodigital.bquiet.beans.Centro;

public class DataBaseQuiet extends DataBaseGenerica {
	private JdbcTemplate jdbc;

	public static final String BASE_DATOS = "reservas";

	public DataBaseQuiet(){
		this.jdbc = new JdbcTemplate(Conector.getDataSource());
	}

	public ArrayList<Centro> listaColegios(){

		String sql = "SELECT * FROM centros";
		ArrayList<Centro> listaCentros= (ArrayList<Centro>)this.jdbc.query(
				sql, 
				new BeanPropertyRowMapper<Centro>(Centro.class)
				);

		return listaCentros;
	}

}
