package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/simpleDataExmaple")
public class ControllerSimpleData {
	
	public static final String SIMPLEEXAMPLE_VIEW = "DatosSimplesExample";
	
	
	@GetMapping("/simpleExampleString")
	public String simpleDataString(Model model) {
		model.addAttribute("name", "Victor");//Ponemos el nombre de la variable que pusimos en el HTML y el valor
		return SIMPLEEXAMPLE_VIEW;
	}
	
	@GetMapping("/simpleExampleMAV")
	public ModelAndView simpleDataMAV() {
		ModelAndView mav = new ModelAndView(SIMPLEEXAMPLE_VIEW);
		mav.addObject("name", "Corey");//Ponemos el nombre de la variable que pusimos en el HTML y el valor
		return mav;
		
	}

}
