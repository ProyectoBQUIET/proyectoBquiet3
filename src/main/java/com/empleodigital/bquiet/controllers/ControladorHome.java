package com.empleodigital.bquiet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class ControladorHome {
			
	@RequestMapping("/")
	public String inicio(){
		return "login";
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam ("user") String user, @RequestParam ("pass") String pass){
		ModelAndView mav = new ModelAndView("login");
		
		Usuario usuario=DataBaseBquiet.getUsuario(user, pass);
		
		if(usuario!=null){
			mav.setViewName("homeAdministrador");
		}
				
		return mav;
	}
	
	
	

}
