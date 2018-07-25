package com.victorfirsttutorial.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorfirsttutorial.backendninja.entity.Curso;
import com.victorfirsttutorial.backendninja.service.CursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	private static final String COURSES_VIEW = "vistaCurso";
	
	private static final Log LOGGER = LogFactory.getLog(CursoController.class);
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CursoService cursoServicio;
	
	@GetMapping("/listaCursos")
	public ModelAndView listAllCurses() {
		LOGGER.info("callC: " + "listAllCurses()");
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("curso", new Curso());
		mav.addObject("cursos", cursoServicio.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addcurso")
	public String addCurse(@ModelAttribute("curso") Curso curso) {
		LOGGER.info("callC: " + "addCurse()" + "Parameter: " + curso.toString());
		cursoServicio.addCurse(curso);
		return "redirect:/cursos/listaCursos";
		
	}
	
	@PostMapping("/deletecurso")
	public String deleteCurse(@ModelAttribute("curso") Curso curso) {
		LOGGER.info("callC: " + "deleteCurse()");
		cursoServicio.removeCurse(curso.getId());
		return "redirect:/cursos/listaCursos";
	}
	
	@PostMapping("/updatecurso")
	public String updateCurso(@ModelAttribute("curso") Curso curso) {
		LOGGER.info("callC: " + "updateCurso()");
		cursoServicio.updateCurse(curso);
		return "redirect:/cursos/listaCursos";
	}

}
