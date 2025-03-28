package com.spring.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Ecommerce.Dto.DatiBaseVenditoreDto;
import com.spring.Ecommerce.Dto.ErroreDto;
import com.spring.Ecommerce.Dto.ProdottoDto;
import com.spring.Ecommerce.Dto.VenditoreDto;
import com.spring.Ecommerce.Service.EcommerceService;

@RestController
@RequestMapping(path = "/ecommerce")
public class EcommerceController {
	
	@Autowired
	private EcommerceService service;
	
	
	
	@PostMapping(consumes = "application/json")
	public boolean inserisciVenditore( @RequestBody VenditoreDto venditore) {
		return service.inserisciVenditore(venditore);
	}
//----------------------------------------------------------------------------------------\\
	
	@GetMapping(path = "/{idVenditore}", produces = "application/json")
	public VenditoreDto cercaPerId(@PathVariable Integer idVenditore) {
		return service.cercaPerId(idVenditore);
	}
//------------------------------------------------------------------------------------------\\
	
	@GetMapping(path = "/{idVenditore}/dati", produces = "application/json")
	public DatiBaseVenditoreDto datiVenditore(@PathVariable Integer idVenditore) {
		return service.datiVenditore(idVenditore);
	}
//--------------------------------------------------------------------------------------------\\
	
	@PatchMapping(path = "/{idVenditore}/modificapassword", produces = "application/json")
	public String updatePassword(@PathVariable Integer idVenditore, @RequestParam String newPassword){
		return service.updatePassword(idVenditore, newPassword);
	}
//-----------------------------------------------------------------------------------------------\\
	
	@PostMapping(path = "{idVenditore}/aggiungi", produces = "application/json")
	public String addProdotto(@PathVariable Integer idVenditore, @RequestBody ProdottoDto prodotto) {
		return service.addProdotto(idVenditore, prodotto);
	}
//-----------------------------------------------------------------------------------------------\\
	
	@PatchMapping(path = "/{idVenditore}/{idProdotto}")
	public VenditoreDto updateQuantità(@PathVariable Integer idVenditore, @PathVariable Integer idProdotto, @RequestParam Integer quantita) {
		return service.updateQuantità(idVenditore, idProdotto, quantita);
	}
//------------------------------------------------------------------------------------------------\\
	
	// gestione errori controller 
	
	@ExceptionHandler
	public ResponseEntity<ErroreDto> gestErr(RuntimeException exc){
		ErroreDto errore = new ErroreDto(exc.getMessage());
		ResponseEntity<ErroreDto> response = new ResponseEntity<ErroreDto>(errore, HttpStatus.NOT_FOUND);
		return response;
	}
}
