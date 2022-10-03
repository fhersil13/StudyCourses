package com.bolsadeideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import com.bolsadeideas.springboot.form.app.validation.UsuarioValidador;

@Controller
@SessionAttributes("usuario")
public class FormController {
	
	@Autowired
	private UsuarioValidador validador;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validador);
	}

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setId("1.037.668.059");
		usuario.setNombre("Fherney");
		usuario.setApellido("Silva");
		model.addAttribute("titulo", "Formulario Usuarios");
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {
//		validador.validate(usuario, result);
		
		model.addAttribute("titulo", "Resultado Formulario Usuarios");
		
		/*Map<String, String> errores = new HashMap<>();
		result.getFieldErrors().forEach(error -> {
			errores.put(error.getField(), "El campo ".concat(error.getField()).concat(" ")
					.concat(error.getDefaultMessage()));
		});
		model.addAttribute("error", errores);*/
		if(result.hasErrors()) return "form";
		status.setComplete();
		model.addAttribute("usuario", usuario);
		return "resultado";
	}
	
}
