package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class ControllerPeticionGet {
	
	private static final String EXAMPLE2_VIEW = "peticionGetExample2";
	
	//Primeera forma localhost:8080/example2/request1?nm=JON
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue="Null") String name) {
		//El valor esta llegando atraves de la URL al metodo del controllador como parametro, lo que hay dentro de los parentecis dice que requiere un parametro con nombre nm el cual no es obligatorio por el false y en caso de que este vacio por defecto aparecera Null y sera un tipo String.
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_modelo", name);
		return mav;
	}
	
	@GetMapping("/request2/{nm}")//Se especifica que la ruta va a necesitar otro parametro al final
	public ModelAndView request2(@PathVariable("nm") String name) {
		//Con esta anotacion le estamos diciendo que vamos a resivir un parametro llamado nm del tipo string
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_modelo", name);
		return mav;
	}


}
