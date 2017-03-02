package com.empleodigital.bquiet.databases;

import java.util.ArrayList;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empleodigital.bquiet.beans.Centro;
import com.empleodigital.bquiet.beans.Usuario;

public class DataBaseBquiet extends DataBaseGenerica {
	private static JdbcTemplate jdbc = new JdbcTemplate(Conector.getDataSource());
	
	public static ArrayList<Usuario> listaUsuarios(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			String sql = "SELECT * FROM usuarios";
			usuarios = (ArrayList<Usuario>)jdbc.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		}catch(EmptyResultDataAccessException e){
			System.out.println("Lista usuarios vacia");
		}
		
		return usuarios;
	}
	
	public static Usuario getUsuario(String nombre, String pass) {
		
		Usuario user=null;

		try {
			user = jdbc.queryForObject(
					"SELECT * FROM usuarios WHERE nombre=? AND pass=?",
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{nombre, pass}
					);
		} catch (Exception e) {
			System.out.println("El usuario no existe!");
		}
		return user;
	}
	public static ArrayList<Centro> listaColegios(){

		String sql = "SELECT * FROM centros";
		ArrayList<Centro> listaCentros= (ArrayList<Centro>) jdbc.query(
				sql, 
				new BeanPropertyRowMapper<Centro>(Centro.class)
				);

		return listaCentros;
	}
	
}
