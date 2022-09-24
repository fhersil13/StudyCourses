package com.bolsadeideas.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@Data
@Component
@RequestScope
public class Factura implements Serializable {
	
	private static final long serialVersionUID = 4009398677503696604L;

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	@Qualifier("ItemsFacturaOficina")
	private List<ItemFactura> items;
	
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida -> ".concat(descripcion));
	}
	
	@PostConstruct
	public void inicializar() {
		String segundoNombre = "Adrian";
		String segundoApellido = "Buitrago";
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre()
				.concat(" ").concat(segundoNombre).concat(" ").concat(cliente.getApellido()
				.concat(" ").concat(segundoApellido)));
		cliente.setNombre(cliente.getNombre().concat(" ").concat(segundoNombre));
		cliente.setApellido(cliente.getApellido().concat(" ").concat(segundoApellido));
		
	}

}
