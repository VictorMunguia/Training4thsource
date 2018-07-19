package com.victorfirsttutorial.backendninja.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //Esto le dice a sprint que cuando haya un error, tiene que venir a esta clase
public class Example5Controller {
	
	public static final String PAGINA_ERROR505 = "error/500";
	
	@ExceptionHandler(Exception.class)//Esto lo que hace es capturar los errores de 500.
	public ModelAndView paginaError() {
		ModelAndView mav = new ModelAndView(PAGINA_ERROR505);
		return mav;
		
	}


}
