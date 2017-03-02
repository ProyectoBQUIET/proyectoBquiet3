package com.empleodigital.bquiet.databases;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empleodigital.bquiet.beans.Centro;
import com.empleodigital.bquiet.beans.TipoUsuario;
import com.empleodigital.bquiet.beans.Usuario;

public class DataBaseBquiet extends DataBaseGenerica {
	private static JdbcTemplate jdbc = new JdbcTemplate(Conector.getDataSource());
	
	public static ArrayList<Usuario> listaUsuarios(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			String sql = "SELECT * FROM usuarios";
			usuarios = (ArrayList<Usuario>)jdbc.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		}catch(Exception e){
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
	
	public static ArrayList<Centro> listaCentros(){

		ArrayList<Centro> listaCentros = new ArrayList<Centro>();
		
		try {
			listaCentros = (ArrayList<Centro>) jdbc.query(
					"SELECT * FROM centros", 
					new BeanPropertyRowMapper<Centro>(Centro.class)
					);
		} catch (Exception e) {}

		return listaCentros;
	}
	
	public static ArrayList<Usuario> listaUsuarios(Usuario u){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			String sql = "SELECT * FROM usuarios_centros WHERE id_usuario=?";
			usuarios = (ArrayList<Usuario>)jdbc.query(sql,
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{u.getId()});
			System.out.println(usuarios);
		}catch(Exception e){
			System.out.println("Lista usuarios vacia");
		}
		
		return usuarios;
	}
	
	public static boolean agregarCentro(String nombreCentro, String superusuario, String pass) {
		
		try {
			jdbc.update("INSERT INTO centros (nombre) VALUES (?)", new Object[]{nombreCentro});
			
			Centro centro = jdbc.queryForObject("SELECT * FROM centros WHERE nombre=?",
					new BeanPropertyRowMapper<Centro>(Centro.class),
					new Object[]{nombreCentro});
			
			jdbc.update("INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (?, ?, ?)",
					new Object[]{TipoUsuario.SUPERUSUARIO, superusuario, pass});
			
			Usuario user = jdbc.queryForObject("SELECT * FROM usuarios WHERE nombre=?",
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{superusuario});
			
			jdbc.update("INSERT INTO usuarios_centros (id_usuario, id_centro) VALUES (?, ?)",
					new Object[]{user.getId(), centro.getId()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	
	
}
