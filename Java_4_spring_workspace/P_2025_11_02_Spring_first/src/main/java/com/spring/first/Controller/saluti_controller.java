package com.spring.first.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/saluto")
public class saluti_controller {
	
	public saluti_controller() {
		System.out.println("Spring istanzia saluto_controller");
	}
	
	@GetMapping(path = "/ciao")
	public String saluto_ciao() {
		return "Hello world";
	}
	
	@GetMapping(path = "/persona")
	public String saluta_persona(String nome){
		return "ciao "+ nome;
	}

}
