package com.bolsadeideas.springboot.error.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	private Integer id;
	
	private String nombre;
	
	private String apellido;

}
