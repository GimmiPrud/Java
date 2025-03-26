package com.spring.phoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.phoneBook.Dto.ContattoDto;
import com.spring.phoneBook.Dto.RubricaDto;
import com.spring.phoneBook.Service.RubricaService;

@RestController
@RequestMapping(path = "/rubriche")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	// metodi 
	@PostMapping(consumes = "application/json")
	public boolean creaRubrica(@RequestBody RubricaDto rubrica) {
		return service.creaRubrica(rubrica);
	}
//---------------------------------------------------------------------\\
	
	@GetMapping(path = "/{idRubrica}", produces = "application/json")
	public RubricaDto cercaPerId(@PathVariable Integer idRubrica) {
		return service.cercaPerId(idRubrica);
	}
//----------------------------------------------------------------------\\
	
	@PostMapping(path = "/{idRubrica}/aggiungi", consumes = "application/json")
	public boolean aggiungiContatto(@PathVariable Integer idRubrica, @RequestBody ContattoDto contatto) {
		return service.aggiungiContatto(idRubrica, contatto);
	}

}
