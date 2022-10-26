package com.bolsadeideas.springboot.di.app.models.services;

public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "Ejecutando operación inicial simple...";
	}
	
}
