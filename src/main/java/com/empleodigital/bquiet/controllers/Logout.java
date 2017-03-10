package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Logout {
	
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("mensajeDespedida", "¡Hasta Pronto!");
		session.invalidate();

		return "login";
	}
	
	
	
	

}
