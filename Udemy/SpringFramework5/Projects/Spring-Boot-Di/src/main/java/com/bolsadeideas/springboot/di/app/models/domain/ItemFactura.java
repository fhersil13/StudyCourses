package com.bolsadeideas.springboot.di.app.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemFactura {

	private Producto producto;
	
	private Integer cantidad;
	
	public Integer calcularTotal() {
		return producto.getPrecio() * cantidad;
	}
	
}
