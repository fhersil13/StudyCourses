package com.bolsadeideas.springboot.web.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	private String nombre;
	private String apellido;
	private String email;
	
}
