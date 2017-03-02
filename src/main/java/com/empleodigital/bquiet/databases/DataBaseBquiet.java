package com.empleodigital.bquiet.databases;

import java.util.ArrayList;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empleodigital.bquiet.beans.Usuario;

public class DataBaseBquiet extends DataBaseGenerica {
	private JdbcTemplate jdbc;
	
	public static final String BASE_DATOS = "reservas";
	
	public DataBaseBquiet(){
		this.jdbc = new JdbcTemplate(Conector.getDataSource());
	}
	
	public ArrayList<Usuario> listaUsuarios(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			String sql = "SELECT * FROM usuarios";
			usuarios = (ArrayList<Usuario>)jdbc.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		}catch(EmptyResultDataAccessException e){
			System.out.println("Lista usuarios vacia");
		}
		
		return usuarios;
	}
	
	
}
