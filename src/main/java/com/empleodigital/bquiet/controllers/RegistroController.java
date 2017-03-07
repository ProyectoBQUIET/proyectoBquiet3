package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.beans.RegistroBean;

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
			
			
			String json = request.getParameter("json");
			
			RegistroBean registro = new ObjectMapper().readValue(json, RegistroBean.class);
			
			System.out.println(registro);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
