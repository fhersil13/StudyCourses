package com.bolsadeideas.springboot.form.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Rol;

@Service
public class RolServiceImpl implements RolService {
	
	private List<Rol> roles;
	
	public RolServiceImpl() {
		this.roles = new ArrayList<>();
		this.roles.add(new Rol(1, "Administrador", "ROL_ADMIN"));
		this.roles.add(new Rol(2, "Usuario", "ROL_USER"));
		this.roles.add(new Rol(3, "Moderador", "ROL_MODERATOR"));
	}

	@Override
	public List<Rol> listar() {
		return roles;
	}

	@Override
	public Rol buscarPorId(Integer id) {
		Rol resultado = null;
		for (Rol rol : roles) {
			if (id == rol.getId()) {
				resultado = rol;
				break;
			}
		}
		return resultado;
	}

}
