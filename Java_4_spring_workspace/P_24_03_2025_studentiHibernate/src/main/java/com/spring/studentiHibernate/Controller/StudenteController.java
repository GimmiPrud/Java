package com.spring.studentiHibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.studentiHibernate.Dto.StudenteDto;
import com.spring.studentiHibernate.Service.StudenteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "/studenti")
public class StudenteController {
	
	@Autowired
	private StudenteService service;
	
	@PostMapping(consumes = "application/json")
	public boolean immatricola(@RequestBody StudenteDto dto) {
		return service.immatricola(dto);
	}
	
	@GetMapping(path = "/{matricola}", produces = "application/json")
	public StudenteDto cerca(@PathVariable Integer matricola) {
		return service.cerca(matricola);
	}
	
	
	
}
