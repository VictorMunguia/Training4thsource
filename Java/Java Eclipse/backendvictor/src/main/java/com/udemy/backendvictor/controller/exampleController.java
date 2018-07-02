package com.udemy.backendvictor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendvictor.model.Person;

@Controller
@RequestMapping("/example")
public class exampleController {
	
	public static final String EXAMPLE_VIEW = "example";//Creamos una constante para almacenar el nombre de la vista.
	
	//Primera forma
	
	@GetMapping("/exampleString")//Este getmapping es lo mismo que el de abajo pero esta es una vercion mas corta, funciona igual pero con menos caracteres.
	public String exampleString(Model model) {
		model.addAttribute("Person", new Person("Corey Wilde",23));
		return EXAMPLE_VIEW;
	}
	
	
	//Segunda forma
	
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mov = new ModelAndView(EXAMPLE_VIEW);
		mov.addObject("Person", new Person("Victor Munguia",22));
		return mov;
	}
	
	


}
