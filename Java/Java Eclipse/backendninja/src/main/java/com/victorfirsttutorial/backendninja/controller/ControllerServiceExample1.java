package com.victorfirsttutorial.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victorfirsttutorial.backendninja.model.Person;

@Controller
@RequestMapping("/ServiceExample1")
public class ControllerServiceExample1 {
	
	public static final String SERVICE_VIEW = "ViewServiceExample1";
	
	@GetMapping("/ServiceExampleString")
	public String String(Model model) {
		model.addAttribute("personas", getPeople());
		return SERVICE_VIEW;
	}
	
	@GetMapping("/ServiceExampleMAV")
	public ModelAndView ExampleMAV() {
		ModelAndView mav = new ModelAndView(SERVICE_VIEW);
		mav.addObject("personas", getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person("Corey", 23, true));
		peopleList.add(new Person("Samara", 24, true));
		peopleList.add(new Person("Kimberly", 19, true));
		peopleList.add(new Person("Martha", 14, true));
		peopleList.add(new Person("Rainer", 21, true));
		peopleList.add(new Person("Sebastian", 45, true));
		peopleList.add(new Person("Yolanda", 17, true));
		return peopleList;
	}

}
