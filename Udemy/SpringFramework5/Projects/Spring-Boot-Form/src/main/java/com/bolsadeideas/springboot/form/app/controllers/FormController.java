package com.bolsadeideas.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		return "form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String procesar(Model model) {
		return "resultado";
	}
	
}
