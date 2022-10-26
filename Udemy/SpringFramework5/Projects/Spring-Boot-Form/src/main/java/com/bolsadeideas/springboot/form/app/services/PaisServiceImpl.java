package com.bolsadeideas.springboot.form.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Pais;

@Service
public class PaisServiceImpl implements PaisService {
	
	private List<Pais> lista;

	public PaisServiceImpl() {
		this.lista = Arrays.asList(
				new Pais(1, "CO", "Colombia"),
				new Pais(2, "ES", "España"),
				new Pais(3, "MX", "México"),
				new Pais(4, "PE", "Perú"),
				new Pais(5, "UR", "Uruguay"));
	}
	
	@Override
	public List<Pais> listar() {
		return lista;
	}

	@Override
	public Pais buscarPaisPorId(Integer id) {
		Pais resultado = null;
		for(Pais pais : this.lista) {
			if(id == pais.getId()) {
				resultado = pais;
				break;
			}
		}
		return resultado;
	}

}
