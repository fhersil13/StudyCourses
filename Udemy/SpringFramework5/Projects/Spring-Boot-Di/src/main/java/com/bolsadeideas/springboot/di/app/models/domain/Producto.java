package com.bolsadeideas.springboot.di.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
	
	private String nombre;
	
	private Integer precio;

}
