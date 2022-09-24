package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parámetros de la ruta (@PathVariable)");
		return "variables/index";
	}
	
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("texto", "El texto enviado es: '" + texto + "'");
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("texto", "El texto enviado es: '" + texto + "'"
							+ " y el número es: " + "'" + numero + "'");
		return "variables/ver";
	}
	
}
