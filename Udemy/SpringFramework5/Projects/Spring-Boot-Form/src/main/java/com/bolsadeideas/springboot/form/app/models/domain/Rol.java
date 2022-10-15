package com.bolsadeideas.springboot.form.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
	
	private Integer id;
	
	private String nombre;
	
	private String rol;

}
