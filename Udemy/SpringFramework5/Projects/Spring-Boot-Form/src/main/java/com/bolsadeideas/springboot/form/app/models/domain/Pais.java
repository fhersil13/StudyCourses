package com.bolsadeideas.springboot.form.app.models.domain;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
	
	@NotNull
	private Integer id;
	
	private String codigo;
	
	private String nombre;

	@Override
	public String toString() {
		return this.id.toString();
	}
	
	
	
}
