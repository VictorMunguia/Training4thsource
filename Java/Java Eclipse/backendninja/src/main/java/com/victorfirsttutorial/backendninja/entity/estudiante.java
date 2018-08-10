package com.victorfirsttutorial.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity//Le indicamos a spring que es una entidad
@Table(name="estudiante")////Nombre de la tabla
public class estudiante {
	
	@Id//Especificamos que este parametro es el ID
	@GeneratedValue//Esta anotacion permite generar automaticamente un valor para el ID de la base de datos.
	@Column(name="id")//Especificamos el nombre del campo
	private int id;
	
	@Column(name="nombre")//Especificamos el nombre del campo
	private String Nombre;
	

	@Column(name="edad")//Especificamos el nombre del campo
	private int Edad;
	
	@Column(name="sexo")//Especificamos el nombre del campo
	private int Sexo;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getSexo() {
		return Sexo;
	}

	public void setSexo(int sexo) {
		Sexo = sexo;
	}

	public estudiante(int id, String nombre, int edad, int sexo) {
		super();
		this.id = id;
		Nombre = nombre;
		Edad = edad;
		Sexo = sexo;
	}
	
	public estudiante() {
		
	}
	
	

}
