package com.victorfirsttutorial.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorfirsttutorial.backendninja.service.ExampleService;

@Controller
@RequestMapping("/ServiceExampleOne")
public class ControllerServiceExampleOne {
	
	
	//Siempre tirenen que ir juntos,las anotaciones con su correspondiente codigo.
	@Autowired
	@Qualifier("exampleService")//Sacamos la clase del servicio del bean sin embargo mandamos a llamar la interfaz
	private ExampleService exampleService;//Aqui mandamos a llamar la interfaz del servicio
	
	public static final String SERVICE_VIEW = "ViewServiceExample1";
	
	@GetMapping("/ServiceExampleString")
	public String String(Model model) {
		model.addAttribute("personas", exampleService.getListPeople());//Finalmente mandamos a llamar el metodo de la clase la cual hereda el metodo de la interfaz
		return SERVICE_VIEW;
	}
	
	@GetMapping("/ServiceExampleMAV")
	public ModelAndView ExampleMAV() {
		ModelAndView mav = new ModelAndView(SERVICE_VIEW);
		mav.addObject("personas", exampleService.getListPeople());//Finalmente mandamos a llamar el metodo de la clase la cual hereda el metodo de la interfaz
		return mav;
	}
	

}
