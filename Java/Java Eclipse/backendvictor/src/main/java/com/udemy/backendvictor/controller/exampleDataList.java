package com.udemy.backendvictor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendvictor.model.Person;

@Controller
@RequestMapping("/exampleList")
public class exampleDataList {
	
	
	private static final String EXAMPLE_LIST = "listData";
	
	//Imprimir Lista
	
	
	@GetMapping("/exampleList")
	public String exampleList(Model model) {
		model.addAttribute("listaPersonas", getPeople());
		return EXAMPLE_LIST;
	}
	
	
	@RequestMapping(value="/exampleMAVList", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mov = new ModelAndView(EXAMPLE_LIST);
		mov.addObject("listaPersonas", getPeople2());
		return mov;
	}
		
	
	
	private List<Person> getPeople(){
		List<Person> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Person("Corey Wilde",23));
		listaPersonas.add(new Person("Victor Munguia",22));
		listaPersonas.add(new Person("Noctis Kazuto",21));
		listaPersonas.add(new Person("Rachel Fernanda",20));
		listaPersonas.add(new Person("Cup Rainer",19));
		return listaPersonas;
	}
	
	
	private List<Person> getPeople2(){
		List<Person> litaPesonas2 = new ArrayList<>();
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		litaPesonas2.add(new Person("Rachel Enciso", 17));
		return litaPesonas2;
		
	}

}
