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
			e.printStackTrace();
		}
		
		return usuarios;
	}
	
	public static Usuario getUsuario(String nombre, String pass) {
		
		Usuario user = null;

		try {
			user = jdbc.queryForObject(
					"SELECT * FROM usuarios WHERE nombre=? AND pass=?",
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{nombre, pass}
					);
		} catch (Exception e) {
			e.printStackTrace();
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
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaCentros;
	}
	
	// Aqui iva un método listaUsuarios pero no sabiamos por que xd
	
	public static ArrayList<Usuario> getUsuariosByCentroId(int id_centro){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			String sql = "SELECT * FROM usuarios_centros,usuarios where usuarios_centros.id_centro=? AND usuarios.id_tipousuario=3 AND usuarios.id=usuarios_centros.id_usuario";
			usuarios = (ArrayList<Usuario>)jdbc.query(sql,
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{id_centro});
			System.out.println(usuarios);
		}catch(Exception e){
			e.printStackTrace();
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
	
	public static Centro getCentro(String nombre) {
		
		Centro centro = null;

		try {
			centro = jdbc.queryForObject(
					"SELECT * FROM centros WHERE nombre=?",
					new BeanPropertyRowMapper<Centro>(Centro.class),
					new Object[]{nombre}
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return centro;
	}
	
	public static Usuario getSuperUsuario(int centro_id) {
		
		Usuario user = null;
		
		try {
			
			String sql = "SELECT * FROM usuarios_centros,usuarios where usuarios_centros.id_centro=? AND usuarios.id_tipousuario=2 AND usuarios.id=usuarios_centros.id_usuario";
			
			user = jdbc.queryForObject(
					sql,
					new BeanPropertyRowMapper<Usuario>(Usuario.class),
					new Object[]{centro_id}
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
}
