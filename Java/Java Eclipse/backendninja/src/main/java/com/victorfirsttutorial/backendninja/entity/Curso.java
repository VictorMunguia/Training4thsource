//1.- CREAMOS LA CLASE LA CLASE EN LA ENTITY PARA REPRESENTAR LAS TABLAS
package com.victorfirsttutorial.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//Le indicamos a spring que es una entidad
@Table(name="curso")////Nombre de la tabla
public class Curso {
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", horas=" + horas + "]";
	}


	@Id//Especificamos que este parametro es el ID
	@GeneratedValue//No se por que pero tambien va XD
	@Column(name="id")//Especificamos el nombre del campo
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private int precio;
	
	@Column(name="horas")
	private int horas;
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
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
	
	
	public int getPrecio() {
		return precio;
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public int getHoras() {
		return horas;
	}
	
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public Curso() {
		
	}


	public Curso(int id, String nombre, String descripcion, int precio, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.horas = horas;
	}

}
