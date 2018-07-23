package com.victorfirsttutorial.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.victorfirsttutorial.backendninja.service.EjercisioAutoEvaluation;

@Controller
@RequestMapping("/ejercisio")
public class controlladorAutoEvaluationOne {
	
	@Autowired
	@Qualifier("ejercisioaAutoEvaluationClass")
	private EjercisioAutoEvaluation service;
	
	
	private static final String View_Example = "ejercisioView";
	
	@GetMapping("/metodo1")//Al ejectuar la pagina con vacio despues de exmaple3 se manda a llamar este metodo
	public RedirectView redirect() {
		return new RedirectView("/ejercisio/metodo2");//Este metodo lo que hace es redireccionarte la siguiente URL
	}
	
	@GetMapping("/metodo2")
	public ModelAndView method2() {
		ModelAndView mav = new ModelAndView(View_Example);
		service.MostrarLog();
		mav.addObject("mensaje", "Este mensaje viene del controlador");
		return mav;
	}

}
