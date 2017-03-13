package com.empleodigital.bquiet.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.empleodigital.bquiet.beans.Centro;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class FiltrarCentro {

	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("filtrarCentro")
	public ModelAndView on() {
		ModelAndView mav = new ModelAndView("homeAdministrador");
		String nombreCentro = request.getParameter("nombreCentroBuscado");
		
		ArrayList<Centro> centros = DataBaseBquiet.getCentroFiltrado(nombreCentro);
		System.out.println(centros);
		mav.addObject("centros",centros);
		
		return mav;	
	}
}
