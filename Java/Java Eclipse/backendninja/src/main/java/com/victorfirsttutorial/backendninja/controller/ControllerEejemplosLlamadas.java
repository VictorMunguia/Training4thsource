package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ControllerEejemplosLlamadas {
	
	
	
	public static final String EXAMPLE_VIEW = "AccesoAVistasexample";
	
	//Primera forma de mandar a llamar una vista
	
	@RequestMapping(value="/exampleString" , method=RequestMethod.GET)//Esta forma de especificar una ruta fue mejorada por el GetMapping
	public String exampleString() {
		return EXAMPLE_VIEW;
	}
	
	//Segunda forma para acceder a una vista
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		return new ModelAndView(EXAMPLE_VIEW);
	}

}
