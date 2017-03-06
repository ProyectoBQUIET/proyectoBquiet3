package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class RegistroApp {
	
	@Autowired
	HttpServletRequest request;

	@RequestMapping(value="appreg")
	public @ResponseBody String on() {
		
		try {
			
			String fecha = request.getParameter("fecha");
			String hora = request.getParameter("hora");
			int media = Integer.parseInt(request.getParameter("media"));
			int valor = Integer.parseInt(request.getParameter("valor"));
			int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
			
			DataBaseBquiet.agregarRegistro(fecha, hora, media, valor, id_usuario);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}