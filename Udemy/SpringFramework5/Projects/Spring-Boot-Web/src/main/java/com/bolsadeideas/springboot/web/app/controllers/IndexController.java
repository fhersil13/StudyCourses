package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.saludo}")
	private String indexSaludo;
	
	@GetMapping({"", "/", "/index", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Spring 5");
		model.addAttribute("saludo", indexSaludo);
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Fherney Adrian");
		usuario.setApellido("Silva Buitrago");
		usuario.setEmail("fherneysilva13@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Fherney Adrian", "Silva Buitrago", "fherneysilva13@gmail.com"),
				new Usuario("Duban Yesid", "Silva Buitrago", "dubansilva02@gmail.com"),
				new Usuario("Juan Camilo", "Ríos Tarazona", "juanrios04@gmail.com"));
		return usuarios;
	}

}
