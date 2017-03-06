package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.empleodigital.bquiet.beans.TipoUsuario;
import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class GestionarUsuario {
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/ver/{usuario}")
	public ModelAndView on(@PathVariable("usuario") String usuario) {
		
		ModelAndView mav = new ModelAndView("login");
		
		if(session.getAttribute("usuarioLogueado") != null && 
				((Usuario)session.getAttribute("usuarioLogueado")).getId() == TipoUsuario.ADMINISTRADOR) {
			
			mav.setViewName("homeUsuario");
			
			Usuario user = DataBaseBquiet.getUsuario(usuario);
			
			if(user!=null) {
				mav.addObject("usuario", user);
			}
			
		}
		
		return mav;
	}

}
