package com.spring.Utente.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Utente.Dto.NomeCognomeDTO;
import com.spring.Utente.Dto.UtenteDTO;
import com.spring.Utente.Service.Utente_Service;
import com.spring.Utente.Utility.Conversioni;
import com.spring.Utente.dao.DAOUtenteMappa;
import com.spring.Utente.entity.Utente; // importiamo la classe utente
	
	@RestController
	@RequestMapping(path= "/utenti")
	public class Utente_Controller {
		
		private Utente_Service service = new Utente_Service();
		private DAOUtenteMappa dao = new DAOUtenteMappa();

	@GetMapping(path= "/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
	//	System.out.println("ho registrato l'utente" + dto);
	//	return true;
		
		return service.registra(dto);
		
	}

	@GetMapping(path = "/cerca/{id}", produces = "application/Json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
	//	return new Utente(id, "mario", "rossi", "mario", "red");
		
		return service.cercaPerId(id);
		
	}


	// creare una lista che si aggiorna per ogni utente registrato e lo manda a schermo
	@GetMapping(path = "/mostraTutti", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<UtenteDTO> mostraTutti(){
		return service.mostraTutti();
		
	}
	
	@GetMapping(path="/modificaPassword/{idUtente}", produces = "application/json")
	public UtenteDTO modificaMail(@PathVariable int idUtente, String password) {
		return service.updatePassword(idUtente, password);
	}
	
	@GetMapping(path="/cancella/{idUtente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO cancellaUtente(@PathVariable int idUtente) {
		return service.cancella(idUtente);
	}

	@GetMapping(path="/nomeCognome/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return service.getNomeCognome(id);
	}
	
}
