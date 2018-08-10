package com.victorfirsttutorial.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.victorfirsttutorial.backendninja.entity.Curso;
import com.victorfirsttutorial.backendninja.entity.estudiante;
import com.victorfirsttutorial.backendninja.service.CursoService;
import com.victorfirsttutorial.backendninja.service.EstudianteService;

@RestController
@RequestMapping("/WebService")
public class CurseAndStudentRest {
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CursoService cursoServicio;
	
	@Autowired
	@Qualifier("estudianteServiceImpl")
	private EstudianteService estudianteService;
	
	
	@RequestMapping(value = "/obtenerEstudiantes", method=RequestMethod.GET,produces="application/json")
	public String getStudents() {
		Gson gson = new Gson();
		
		String jsonEmployee = "";
		List<estudiante> listEstudiantes = new ArrayList<estudiante>();
		
		try {
			listEstudiantes = estudianteService.ImprimirTodosEstudiantes();
			jsonEmployee = gson.toJson(listEstudiantes);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return jsonEmployee;
	}
	
	
	
	@RequestMapping(value = "/crearEstudiante", method=RequestMethod.POST,produces="application/json")
	public @ResponseBody String PostStudents(@RequestBody estudiante student) {
		
		estudianteService.AgregarEstudiante(student);

		
		Gson gson = new Gson();
				
				String jsonEmployee = "";
				List<estudiante> listEstudiantes = new ArrayList<estudiante>();
				
				try {
					listEstudiantes = estudianteService.ImprimirTodosEstudiantes();
					jsonEmployee = gson.toJson(listEstudiantes);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				return jsonEmployee;
	}
	
	
	
	//Cursos-----------------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value = "/obtenerCursos", method=RequestMethod.GET,produces="application/json")
	public String getCursos() {
		Gson gson = new Gson();
		
		String jsonEmployee = "";
		List<Curso> listEstudiantes = new ArrayList<Curso>();
		
		try {
			listEstudiantes = cursoServicio.listAllCourses();
			jsonEmployee = gson.toJson(listEstudiantes);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return jsonEmployee;
	}
	
	

}
