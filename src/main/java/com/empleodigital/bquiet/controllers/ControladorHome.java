package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empleodigital.bquiet.beans.TipoUsuario;
import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class ControladorHome {
	
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/")
	public String inicio(){
		
		return "login";
	}
	
	@RequestMapping("login")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("login");
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if(user!=null && pass!=null) {
			
			Usuario usuario=DataBaseBquiet.getUsuario(user, pass);
			
			if(usuario!=null){
				session.setAttribute("usuarioLogueado", usuario);
				System.out.println(usuario.getId_tipousuario());
				if(usuario.getId_tipousuario()==TipoUsuario.ADMINISTRADOR){
					mav.setViewName("homeAdministrador");
					mav.addObject("centros", DataBaseBquiet.listaCentros());
				}else if(usuario.getId_tipousuario()==TipoUsuario.SUPERUSUARIO){
					mav.setViewName("infoCentro");
				}else if(usuario.getId_tipousuario()==TipoUsuario.USUARIO){
					mav.setViewName("infoUsuario");
				}
			}else{
				mav.addObject("mensajeError","Usuario o contraseņa incorrecto");
				
			}
		} else {
			mav.addObject("mensajeError","Usuario o contraseņa incorrecto");
			
		}
				
		return mav;
	}
	
	
	

}
