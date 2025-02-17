package com.spring.Prodotti.Controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Prodotti.DTO.Prodotti_DTO;
import com.spring.Prodotti.DTO.ProdottoNoIdDTO;
import com.spring.Prodotti.Service.Prodotti_service;
import com.spring.Prodotti.dao.Dao_prodotti_mappa;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(path= "/prodotti")
public class Prodotti_Controller {
	
	private Prodotti_service service = new Prodotti_service();
	
	
	@GetMapping(path= "/registra", consumes = "application/json")
	public boolean registra(@RequestBody Prodotti_DTO dto) {
	//	return true;
		
		return service.registra(dto);
	}
	
	@GetMapping(path = "/cerca/{id}", produces = "application/Json")
	public Prodotti_DTO cercaPerId(@PathVariable int id) {
	//	return new Prodotto;
		
		return service.cercaPerId(id);
		
	}
	
	@GetMapping(path = "/mostraTutti", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<Prodotti_DTO> mostraTutti(){
		return service.mostraTutti();
		
	}
	
	@GetMapping(path = "/mostraTuttiNoId", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<ProdottoNoIdDTO> mostraTuttiNoId(){
		return service.mostraTuttiNoId();
		
	}
	
	@GetMapping(path = "/report_desc", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> report_desc(){
		return service.descrizioneProdotti();
	}
	
	@GetMapping(path = "/pezzi_totali", produces = MediaType.APPLICATION_JSON_VALUE)
	public int Pezzi_totali() {
		return service.pezziTotali();
	}
	
	@GetMapping(path = "/nonDisponibili", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> prodottiNonDisponibili(){
		return service.prodottiNonDisponibili();
	}
	
	@GetMapping(path = "/descrizione_prodotti", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> descrizioneProdotti(){
		return service.descrizioneProdotti();
	}
	
	@GetMapping(path = "/tot_non_disponibili", produces = MediaType.APPLICATION_JSON_VALUE)
	public int TotNonDisponibili() {
		return service.TotNonDisponibili();
	}
	
	@GetMapping(path = "/media_pezzi", produces = MediaType.APPLICATION_JSON_VALUE)
	public double media_pezzi() {
		return service.media_pezzi();
	}
	
	
	

}
