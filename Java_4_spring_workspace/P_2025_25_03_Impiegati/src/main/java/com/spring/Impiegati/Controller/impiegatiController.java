package com.spring.Impiegati.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Impiegati.Dto.NomeCognomeDto;
import com.spring.Impiegati.Dto.impiegatiDto;
import com.spring.Impiegati.service.impiegatiService;

@RestController
@RequestMapping(path = "/impiegati")
public class impiegatiController {
	
	@Autowired
	private impiegatiService service;
	
//---------------------------------------------------------------\\
	
	@PostMapping(consumes = "application/json")
	public boolean assumi(@RequestBody impiegatiDto impiegato) {
		return service.assumi(impiegato);
	}
//------------------------------------------------------------------\\
	
	@GetMapping(path = "{matricola}", produces = "application/json")
	public impiegatiDto cerca(@PathVariable Integer matricola) {
		return service.cerca(matricola);
	}
//------------------------------------------------------------------\\
	
	@GetMapping(path = "tutti", produces = "application/json")
	public List<impiegatiDto> visualizzaTutti(){
		return service.visualizzaTutti();
	}
//-----------------------------------------------------------------\\
	
	@DeleteMapping(path = "/{matricola}/elimina", produces = "application/json")
	public impiegatiDto licenzia(@PathVariable Integer matricola) {
		return service.licenzia(matricola);
	}
//------------------------------------------------------------------\\
	
	@PatchMapping(path = "/{matricola}/modificaSalario/{salario}", produces = "application/json")
	public impiegatiDto modSalario(@PathVariable Integer matricola, @PathVariable Double salario) {
		return service.modSalario(matricola, salario);
	}
	
//-------------------------------------------------------------------\\
	
	@DeleteMapping(path = "/{matricola}/delete", produces = "application/json")
	public NomeCognomeDto cancella(@PathVariable Integer matricola) {
		return service.cancella(matricola);
	}
//--------------------------------------------------------------------\\
	
	@GetMapping(path = "/Nominativi", produces = "application/json")
	public List<NomeCognomeDto> listaNominativi(){
		return service.listaNominativi();
	}
//--------------------------------------------------------------------\\
	
	@GetMapping(path = "/{salario}/maggiore", produces = "application/json")
	public List<impiegatiDto> getSalario(@PathVariable Double salario){
		return service.getSalario(salario);
	}
//---------------------------------------------------------------------\\
	
	@GetMapping(path = "/cognomi", produces = "application/json")
	public List<impiegatiDto> orderCognome(){
		return service.orderCognome();
	}
//---------------------------------------------------------------------\\
	
	@GetMapping(path = "/salario", produces = "application/json")
	public List<impiegatiDto> orderSalario(){
		return service.orderSalario();
	}
	
}
