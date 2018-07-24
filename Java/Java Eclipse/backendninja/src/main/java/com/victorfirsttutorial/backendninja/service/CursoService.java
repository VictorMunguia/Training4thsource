//3.- Creamos una interfaz para implementar los metodos que seran creados en el servicio. (interfaz dentro de servicio.)
package com.victorfirsttutorial.backendninja.service;

import java.util.List;

import com.victorfirsttutorial.backendninja.entity.Curso;

public interface CursoService {
	
	public abstract List<Curso> listAllCourses();
	public abstract Curso addCurse(Curso addCurso);
	public abstract int removeCurse(int id);
	public abstract Curso updateCurse(Curso updateCurse);
	
}
