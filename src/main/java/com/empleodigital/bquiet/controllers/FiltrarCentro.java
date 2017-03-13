package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class FiltrarCentro {

	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("filtrarCentro")
	public void on() {
		
		String nombreCentro = request.getParameter("nombreCentroBuscado");
		
	
		
	
	}
}
