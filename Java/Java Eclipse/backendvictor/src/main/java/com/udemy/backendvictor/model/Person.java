package com.udemy.backendvictor.model;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String nombre, int edad) {
		name = nombre;
		age = edad;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
