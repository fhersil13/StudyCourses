package com.bolsadeideas.springboot.form.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
	
	private Integer id;
	
	private String nombre;
	
	private String rol;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Rol)) return false;
		Rol rol = (Rol) obj;
		return this.id != null && this.id.equals(rol.getId());
	}

	
	
}
