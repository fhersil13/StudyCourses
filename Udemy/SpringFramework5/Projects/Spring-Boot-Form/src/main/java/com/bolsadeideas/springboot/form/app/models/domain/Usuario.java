package com.bolsadeideas.springboot.form.app.models.domain;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.form.app.validation.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validation.Requerido;

import lombok.Data;

@Data
public class Usuario {
	
//	@Pattern(regexp = "[1-9]{1}[.][\\d]{3}[.][0-9]{3}[.][0-9]{3}")
	@IdentificadorRegex
	private String id;
	
//	@NotEmpty
	private String nombre;
	
//	@NotEmpty
	@Requerido
	private String apellido;
	
	@NotBlank
	@Size(min = 3, max = 9)
	private String username;
	
	@NotEmpty
	private String password;
	
	@Requerido
	@Email
	private String email;
	
	@NotNull
	@Min(5)
	@Max(5000)
	private Integer cuenta;
	
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaNacimiento;

}
