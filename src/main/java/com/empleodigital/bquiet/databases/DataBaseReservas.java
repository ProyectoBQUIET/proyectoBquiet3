package com.empleodigital.bquiet.databases;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataBaseReservas extends DataBaseGenerica {
	private JdbcTemplate jdbc;
	
	public static final String BASE_DATOS = "reservas";
	
	public DataBaseReservas(){
		this.jdbc = new JdbcTemplate(Conector.getDataSource());
	}
	
	
	
}
