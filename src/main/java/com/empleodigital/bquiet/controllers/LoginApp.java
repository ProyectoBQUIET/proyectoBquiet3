package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class LoginApp {
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/applogin")
	public @ResponseBody Usuario on() {
		Usuario user = null;
		
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		
		if(nombre!=null && pass!=null) {
			
			user = DataBaseBquiet.getUsuario(nombre, pass);
			
		}
		
		return user;
	}

}
