package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.beans.ListaRegistroBean;

@Controller
public class ListaRegistroController {
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="ez")
	public String on2() {
		return "listaTEST";
	}
	
	
	@RequestMapping(value="listaRegistros", method=RequestMethod.POST)
	public @ResponseBody String on() {
		
		try {
			
			String json = request.getParameter("json");
			ListaRegistroBean lista = new ObjectMapper().readValue(json, ListaRegistroBean.class);
			
			System.out.println(lista);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return null;
	}

}
