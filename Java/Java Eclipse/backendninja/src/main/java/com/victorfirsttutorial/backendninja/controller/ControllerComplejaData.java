package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Inicializacion del objeto Person
import com.victorfirsttutorial.backendninja.model.Person;


@Controller
@RequestMapping("/complejaExample")
public class ControllerComplejaData {
	
	public static final String COMPLEJAEXAMPLE_VIEW ="DatosComplejosExample";

	
	@GetMapping("/complejaString")
	public String ComplejaExampleString(Model model) {
		model.addAttribute("persona", new Person("Victor",22,true));
		return COMPLEJAEXAMPLE_VIEW ;
	}
	
	
	
	@GetMapping("/complejaMAV")
	public ModelAndView complejaExampleMAV() {
		ModelAndView mav = new ModelAndView(COMPLEJAEXAMPLE_VIEW);
		mav.addObject("persona", new Person("Corey",23,true));
		return mav;
		
	}
	
	
	

}
