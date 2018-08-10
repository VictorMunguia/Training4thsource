package com.MyProject.Movies.model;

public class contactModel {
	

	private int id;
	private String firstname;
	private String lastname;
	private String telefon;
	private String city;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public contactModel(int id, String firstname, String lastname, String telefon, String city) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telefon = telefon;
		this.city = city;
	}
	
	public contactModel() {
		
	}

	@Override
	public String toString() {
		return "contactModel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", telefon=" + telefon
				+ ", city=" + city + "]";
	}
	
	
	
}
