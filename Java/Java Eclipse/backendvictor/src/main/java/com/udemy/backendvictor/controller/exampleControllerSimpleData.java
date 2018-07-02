package com.udemy.backendvictor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exampleSimple")
public class exampleControllerSimpleData {
public static final String EXAMPLESIMPLE_VIEW = "simpledata";//Creamos una constante para almacenar el nombre de la vista.
	
	//Primera forma
	
	@GetMapping("/exampleStringSimple")//Este getmapping es lo mismo que el de abajo pero esta es una vercion mas corta, funciona igual pero con menos caracteres.
	public String exampleString(Model model) {
		model.addAttribute("name","Corey Wilde");
		return EXAMPLESIMPLE_VIEW;
	}
	
	
	//Segunda forma
	
	@RequestMapping(value="/exampleMAVSimple", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mov = new ModelAndView(EXAMPLESIMPLE_VIEW);
		mov.addObject("name","Victor Munguia");
		return mov;
	}
	
	
	

}
