package com.empleodigital.bquiet.databases;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataBaseBquiet extends DataBaseGenerica {
	private JdbcTemplate jdbc;
	
	public static final String BASE_DATOS = "reservas";
	
	public DataBaseBquiet(){
		this.jdbc = new JdbcTemplate(Conector.getDataSource());
	}
	
	
	
}
