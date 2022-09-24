package com.bolsadeideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {
	
	@GetMapping("/")
	public String index(Model model) {
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(name = "texto", defaultValue = "No se ha enviado el parámetro") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: ".concat(texto));
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("saludo", "El saludo enviado es: '" + saludo + "'");
		model.addAttribute("numero", "El número enviado es: '" + numero + "'");
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero = null;
		try {
			numero = Integer.parseInt(request.getParameter("numero"));
		} catch(NumberFormatException e) {
			numero = 0;
		}
		
		model.addAttribute("saludo", "El saludo enviado es: '" + saludo + "'");
		model.addAttribute("numero", "El número enviado es: '" + numero + "'");
		return "params/ver";
	}

}
