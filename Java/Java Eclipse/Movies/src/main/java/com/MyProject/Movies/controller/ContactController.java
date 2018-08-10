package com.MyProject.Movies.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MyProject.Movies.constants.ViewConstants;
import com.MyProject.Movies.model.contactModel;
import com.MyProject.Movies.service.contactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	@Qualifier("contactServiceImplementation")
	private contactService contactServiceImp;
	
	
	private static final Log LOG =  LogFactory.getLog(ContactController.class);
	
	@GetMapping("/cancel")
	public String cancel() {
		return ViewConstants.CONTACTS;
	}
	
	@GetMapping("/contactform")
	private String redirectToContactForm( Model model) {
		
		model.addAttribute("contactModel", new contactModel());
		return ViewConstants.CONTACT_FORM;
	}
	
	@PostMapping("/addcontact")
	public String Addcontact(@ModelAttribute(name="contactModel") contactModel contactModel, Model model) {
		
		LOG.info("METODO: Addcontact() "+"PARAMETROS: " + contactModel.toString());
		model.addAttribute("result", 1);
		contactServiceImp.addContact(contactModel);
		return ViewConstants.CONTACTS;
		
	}

}
