package com.bolsadeideas.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listar();
	
	public Usuario buscarPorId(Integer id);
	
	public Optional<Usuario> buscarPorIdOptional(Integer id);

}
