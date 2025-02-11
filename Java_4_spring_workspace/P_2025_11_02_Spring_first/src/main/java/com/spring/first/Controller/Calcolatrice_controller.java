package com.spring.first.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation che crea il legame con Spring che dovrà gestire questa classe
@RequestMapping(path = "/Calcola") 
public class Calcolatrice_controller {
	
	
	// qui ci sarebbe il costruttore di default
	
	@GetMapping(path = "/addizione")
	public int somma(int n1, int n2) {
		return n1 + n2;
	}
}
