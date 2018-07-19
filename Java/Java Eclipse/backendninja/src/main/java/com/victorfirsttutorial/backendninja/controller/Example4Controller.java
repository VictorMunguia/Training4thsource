//Esto solo es para mostrar la pagina de error 404
package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/error404")
public class Example4Controller {
	
	public static final String PAGINA_ERROR = "404";
	
	@GetMapping("/formError404")
	public ModelAndView paginaError() {
		ModelAndView mav = new ModelAndView(PAGINA_ERROR);
		return mav;
		
	}

}
