package com.victorfirsttutorial.backendninja.model;

public class CursoModel {
	
	private String nombre;
	private String descripcion;
	private int horas;
	private int precio;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public CursoModel() {
		
	}

	public CursoModel(String nombre, String descripcion, int horas, int precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas = horas;
		this.precio = precio;
	}
	
	

}
