package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Primary
	@Bean("MiServicioSimple")
	public IServicio registrarMiServicioSimple() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Primary
	@Bean("ItemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Celular Redmi", 900000);
		Producto producto2 = new Producto("Disco Duro SSD", 450000);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 6);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("ItemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG LCD 24'", 1200000);
		Producto producto2 = new Producto("Notebook Asus", 3500000);
		Producto producto3 = new Producto("Impresora HP Multifuncional", 700000);
		Producto producto4 = new Producto("Escritorio Oficina", 650000);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 6);
		ItemFactura linea3 = new ItemFactura(producto3, 4);
		ItemFactura linea4 = new ItemFactura(producto4, 5);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
	
}
