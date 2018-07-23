package com.victorfirsttutorial.backendninja.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	
	@NotNull
	@Size(min=2, max=6)
	private String name;
	
	@NotNull
	@Min(18)
	private int age;
	private boolean Sexo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String Nombre) {
		name = Nombre;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int Edad) {
		age = Edad;
	}
	
	public boolean getSexo() {
		return Sexo;
	}
	
	public void setSexo(boolean Sexo) {
		this.Sexo = Sexo;
	}
	
	public Person(String name, int age, boolean Sexo) {
		this.name = name;
		this.age = age;
		this.Sexo = Sexo;
	}
	
	public Person() {}//Constructor vacio para inicializar un objeto persona vacio en el formulario

}
