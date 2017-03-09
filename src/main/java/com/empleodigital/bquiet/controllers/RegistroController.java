package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.beans.ListaRegistroBean;
import com.empleodigital.bquiet.beans.RegistroBean;
import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class RegistroController {
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="gg")
	public String gg() {
		return "registroTEST";
	}
	
	@RequestMapping(value="/registro", method=RequestMethod.POST)
	public @ResponseBody String on() {
		
		try {
			
			String token = request.getParameter("token");
			
			Usuario user = DataBaseBquiet.getUsuarioByToken(token);
			
			if(user!=null) {
				
				int media = Integer.parseInt(request.getParameter("media"));
				
				long fecha = Long.parseLong(request.getParameter("fecha"));
				
				String json = request.getParameter("json");
				
				ListaRegistroBean lista = new ObjectMapper().readValue(json, ListaRegistroBean.class);
				
				int id_registro = DataBaseBquiet.agregarRegistro(media, user.getId(), fecha);
				
				//int id_registro = DataBaseBquiet.getIdUltimoRegistro();
				
				for(RegistroBean reg : lista.getRegistros()) {
					DataBaseBquiet.agregarListaRegistro(id_registro, reg.getFecha(), reg.getValor());
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
