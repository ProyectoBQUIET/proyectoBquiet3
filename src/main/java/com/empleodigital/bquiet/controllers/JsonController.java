package com.empleodigital.bquiet.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empleodigital.bquiet.beans.JsonBean;

@Controller
public class JsonController {
	
	@RequestMapping(value="getjson")
	public @ResponseBody ArrayList<JsonBean> on() {
		ArrayList<JsonBean> lista = new ArrayList<JsonBean>();
		for (int i = 0; i <24; i++) {
			lista.add(new JsonBean());
		}
		return lista;
	}

}
