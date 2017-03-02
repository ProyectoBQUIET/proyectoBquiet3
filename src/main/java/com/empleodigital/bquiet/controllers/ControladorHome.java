package com.empleodigital.bquiet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class ControladorHome {
	DataBaseBquiet db = new DataBaseBquiet();	
	
	@RequestMapping("/")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/")
	public String leddgin(){
		
		
		return "login";
	}
	

}
