package com.spring.first.Controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
public class data_controller {
	
	
	@GetMapping(path = "/dataLocale")
	public String Date() {
		LocalDate d = LocalDate.now();
		return "Data corrente: " + d;
		
	}

}
