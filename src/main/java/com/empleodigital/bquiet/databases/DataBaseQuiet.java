package com.empleodigital.bquiet.databases;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataBaseQuiet extends DataBaseGenerica {
	private JdbcTemplate jdbc;
	
	public static final String BASE_DATOS = "reservas";
	
	public DataBaseQuiet(){
		this.jdbc = new JdbcTemplate(Conector.getDataSource());
	}
	
	
	
}
