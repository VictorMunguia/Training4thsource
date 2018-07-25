//4.- Finalmente en el servicio implementamos los metodos de la interfaz y su logica de negocios.
package com.victorfirsttutorial.backendninja.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.victorfirsttutorial.backendninja.entity.Curso;
import com.victorfirsttutorial.backendninja.reporsitory.CursoJpaRepositorio;
import com.victorfirsttutorial.backendninja.service.CursoService;

@Service("courseServiceImpl")
public class CursoServiceImpl implements CursoService {
	
	private static final Log LOGGER = LogFactory.getLog(CursoServiceImpl.class);
	
	@Autowired
	@Qualifier("cursoJpaRepositorio")
	private CursoJpaRepositorio cursoJpaRepositorio;

	@Override
	public List<Curso> listAllCourses() {
		LOGGER.info("callS: " + "listAllCourses()");
		return cursoJpaRepositorio.findAll();
	}

	@Override
	public Curso addCurse(Curso addCurso) {//El parametro que estamos pidiendo en el metodo se pondra como parametro en el metodo save del jpa.
		LOGGER.info("callS: " + "addCurse()");
		return cursoJpaRepositorio.save(addCurso);
	}

	@Override
	public int removeCurse(int id) {
		cursoJpaRepositorio.deleteById(id);
		return 0;
	}

	@Override
	public Curso updateCurse(Curso updateCurse) {
		return cursoJpaRepositorio.save(updateCurse);
	}
	

}
