package com.MyProject.Movies.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MyProject.Movies.constants.ViewConstants;
import com.MyProject.Movies.model.userCredential;

@Controller
public class LoginController {
	
	private static final Log LOG =  LogFactory.getLog(LoginController.class);
	
	@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("METODO: redirectToLogin()");
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm( Model model, @RequestParam(name="error", required=false) String error, /* Anoder request param*/ @RequestParam(name="logout", required=false) String logout) {
		
		LOG.info("METODO: showLoginForm() -- PARAMETROS: error: " + error + " ,logout: " + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("userCredentials", new userCredential());
		return ViewConstants.LOGIN;
	}
	
	@PostMapping("/logicheck")
	public String loginCheck(@ModelAttribute (name="userCredentials") userCredential userCredential) {
		
		LOG.info("METODO: showLoginForm() -- PARAMETROS: " + userCredential.toString());
		if(userCredential.getUsername().equals("victor00171") && userCredential.getPassword().equals("reiben00")) {
			return ViewConstants.CONTACTS;
		}
			
		return "redirect:/login?error";
	}

}
