package com.empleodigital.bquiet.controllers;

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
	
	@RequestMapping("/")
	public String inicio(){
		
		return "login";
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam ("user") String user, @RequestParam ("pass") String pass){
		ModelAndView mav = new ModelAndView("login");
		
		Usuario usuario=DataBaseBquiet.getUsuario(user, pass);
		
		if(usuario!=null){
			session.setAttribute("usuarioLogueado", usuario);
			System.out.println(usuario.getId_tipousuario());
			if(usuario.getId_tipousuario()==TipoUsuario.ADMINISTRADOR){
				mav.setViewName("homeAdministrador");
				mav.addObject("centros", DataBaseBquiet.listaCentros());
			}else if(usuario.getId_tipousuario()==TipoUsuario.SUPERUSUARIO){
				mav.setViewName("homeSuperUsuario");
				mav.addObject("superusuario",DataBaseBquiet.getUsuario(user, pass));
				mav.addObject("centro",DataBaseBquiet.getCentroByIdSuperUsuario(DataBaseBquiet.getUsuario(user, pass).getId()));
				mav.addObject("usuarios",DataBaseBquiet.getUsuariosByCentroId(DataBaseBquiet.getCentroByIdSuperUsuario(DataBaseBquiet.getUsuario(user, pass).getId()).getId()));
			}else if(usuario.getId_tipousuario()==TipoUsuario.USUARIO){
				mav.setViewName("homeUsuario");
			}
		}else{
			mav.addObject("mensajeError","Usuario o contraseña incorrecto");
			
		}
				
		return mav;
	}
	
	
	

}
