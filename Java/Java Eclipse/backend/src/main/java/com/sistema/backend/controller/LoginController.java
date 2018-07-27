package com.sistema.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sistema.backend.model.UserCredencial;
@Controller
@RequestMapping("/victor")
public class LoginController {
	
	
	private static final Log LOGGER =LogFactory.getLog(LoginController.class);
	@GetMapping("/oso")
	public String msg () {
		return "hola";
	}
	
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model,@RequestParam(name="error", defaultValue="", required=false) String error) {
		model.addAttribute("userCredentials", new UserCredencial());
		return "login";
	}
	
	@PostMapping("/loginCheck")
	public String loginCheck(@ModelAttribute(name="userCredentials") UserCredencial userCredencial) {
		
		LOGGER.info("METODO DE VERIFICACION--------------------------------------");
		if(userCredencial.getUserName().equals("victor00171") && userCredencial.getPassword().equals("reiben00")) {
			
			LOGGER.info("INFORMACION CORRECTA--------------------------------------");
			return "contacts";
			
		}else {
			
			LOGGER.info("INFORMACION INCORRECTA--------------------------------------");
			return "redirect:/login?error";
			
		}
	}
}
