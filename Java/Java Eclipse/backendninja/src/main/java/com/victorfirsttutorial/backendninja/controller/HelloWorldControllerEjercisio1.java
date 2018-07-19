package com.victorfirsttutorial.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWorldControllerEjercisio1 {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "helloWorldEjercicio1";
	}

}
