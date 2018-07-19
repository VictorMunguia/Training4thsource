package com.victorfirsttutorial.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.victorfirsttutorial.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class ControllerPeticionPost {
	
	private static final Log LOGGER =LogFactory.getLog(ControllerPeticionPost.class);//Inicialisamos un log, en los parentecis ponemos la clase responsable.
	
	public static final String FORM_VIEW ="formulario";
	public static final String RESULT_VIEW ="formularioResult";
	
	//Metodo uno para redireccionar
	//@GetMapping("/")
	//public String redirect() {
	//	  return "redirect:/example3/showForm";
	//}
	
	//Metodo dos y el que propone sprint para redireccionar
	
	
	@GetMapping("/")//Al ejectuar la pagina con vacio despues de exmaple3 se manda a llamar este metodo
	public RedirectView redirect() {
		return new RedirectView("/example3/showForm");//Este metodo lo que hace es redireccionarte la siguiente URL
	}
	
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		LOGGER.info("INFO TRACE");//Estos mensajes nos ayudan a reconocer errores en el software, poniendo el tipo que es y entre comillas el mensaje.
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		model.addAttribute("objetoPersonMandar", new Person());//Se esta inicializando un objeto persona pero vacio, debido al constructor que se sobrecarga en el modelo.
		return FORM_VIEW;
	}
	
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("objetoPersonMandar") Person personObjetoMetodo) {//Este resive el objeto con ModelAttribute del tipo person
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person", personObjetoMetodo);
		return mav;
	}

}
