package com.spring.Rubrica.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Rubrica.Service.RubricaService;

@RestController
@RequestMapping(path = "/rubrica")
public class RubricaController {
	
	private RubricaService rubServ = new RubricaService();
}
