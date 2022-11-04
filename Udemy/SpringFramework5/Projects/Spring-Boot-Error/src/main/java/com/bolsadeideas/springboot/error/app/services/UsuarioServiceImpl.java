package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	
	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Fherney", "Silva"));
		this.lista.add(new Usuario(2, "Duban", "Silva"));
		this.lista.add(new Usuario(3, "Javier", "Silva"));
		this.lista.add(new Usuario(4, "Yanett", "Buitrago"));
		this.lista.add(new Usuario(5, "Teresa", "Cote"));
		this.lista.add(new Usuario(6, "Ingrid", "Silva"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario usuario : lista) {
			if (usuario.getId().equals(id)) {
				resultado = usuario;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> buscarPorIdOptional(Integer id) {
		Usuario usuario = this.buscarPorId(id);
		return Optional.ofNullable(usuario);
	}

}
