package com.victorfirsttutorial.backendninja.service;

import java.util.List;

import com.victorfirsttutorial.backendninja.entity.estudiante;

public interface EstudianteService {
	
	public abstract List<estudiante> ImprimirTodosEstudiantes();
	public abstract estudiante AgregarEstudiante(estudiante addstudent);
	

}
