package com.spring.universita.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.DTO.StudenteDTO;
import com.spring.universita.Service.StudentiService;

@RestController
@RequestMapping(path = "/studenti")
public class studenti_controller {
	
	private StudentiService service = new StudentiService();
	
	@GetMapping(path = "/registraStudente", consumes = "application/json")
	public boolean registra(@RequestBody StudenteDTO sdto) {
		
		return service.registra(sdto);
	}
	
	@GetMapping(path = "/cerca/{matricola}", produces = "application/Json")
	public StudenteDTO cercaMatricola(@PathVariable int matricola) {
		
		return service.cercaPerMatricola(matricola);
	}
	
	@GetMapping(path = "/mostraStudenti", produces= "application/Json" )
	public List<StudenteDTO> mostraStudenti(){
		return service.mostraTuttiStu();
	}
	
	@GetMapping(path = "/cancella/{matricola}", produces = "application/Json")
	public StudenteDTO cancellaStudente(@PathVariable int matricola) {
		return service.cancella(matricola);
	}
	
	@GetMapping(path = "/modificaIndirizzo/{matricola}", produces = "application/Json")
	public StudenteDTO modificaIndirizzo(@PathVariable int matricola, String indirizzo) {
		return service.updateIndirizzo(matricola, indirizzo);
	}
	
}
