package com.victorfirsttutorial.backendninja.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.victorfirsttutorial.backendninja.entity.estudiante;
import com.victorfirsttutorial.backendninja.reporsitory.EstudianteJpaRepositorio;
import com.victorfirsttutorial.backendninja.service.EstudianteService;

@Service("estudianteServiceImpl")
public class EstudianteServiceImpl implements EstudianteService {
	
	private static final Log LOGGER = LogFactory.getLog(CursoServiceImpl.class);


	@Autowired
	@Qualifier("estudianteJpaRepositorio")
	private EstudianteJpaRepositorio estudianteJpaRespositorio;
	
	@Override
	public List<estudiante> ImprimirTodosEstudiantes() {
		
		LOGGER.info("Metodo Imprimir Todo Estudiantes");
		
		return estudianteJpaRespositorio.findAll();
	}

	@Override
	public estudiante AgregarEstudiante(estudiante addstudent) {
		LOGGER.info("Metodo crear estudiante");
		return estudianteJpaRespositorio.save(addstudent);
	}

}
