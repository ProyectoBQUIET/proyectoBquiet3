package com.empleodigital.bquiet.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.empleodigital.bquiet.beans.TipoUsuario;
import com.empleodigital.bquiet.beans.Usuario;
import com.empleodigital.bquiet.databases.DataBaseBquiet;

@Controller
public class NuevaAula {
	
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="nuevaAula")
	public ModelAndView on() {
		ModelAndView mav = new ModelAndView("login");
		
		if(session.getAttribute("usuarioLogueado") != null)  {
			
			Usuario loged = (Usuario) session.getAttribute("usuarioLogueado");
			
			int id_centro = Integer.parseInt(request.getParameter("id_centro"));
			
			String nombreAula = request.getParameter("nombreAula");
			
			
			if(loged.getId_tipousuario() == TipoUsuario.ADMINISTRADOR ||
					loged.getId_tipousuario() == TipoUsuario.SUPERUSUARIO &&
					DataBaseBquiet.getSuperUsuario(id_centro).getId() == loged.getId()
					) {
				
				DataBaseBquiet.agregarAula(nombreAula, id_centro);
				
				mav.addObject("centro", DataBaseBquiet.getCentroById(id_centro));
				
				mav.addObject("superusuario", DataBaseBquiet.getSuperUsuario(id_centro));
				
				mav.addObject("usuarios", DataBaseBquiet.getUsuariosByCentroId(id_centro));
				
				mav.addObject("aulas", DataBaseBquiet.getAulasByCentroId(id_centro));
				
				mav.setViewName("administradorCentro");
				
			}
		
	}
		return mav;
	}

}
