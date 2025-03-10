package com.example.Rubrica.spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rubrica.spring.dto.ContNomeCognomeDto;
import com.example.Rubrica.spring.dto.ContattoTelefonicoDto;
import com.example.Rubrica.spring.dto.Proprietario_anno_dto;
import com.example.Rubrica.spring.dto.RubricaDto;
import com.example.Rubrica.spring.dto.propNumDto;
import com.example.Rubrica.spring.service.RubricaService;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/rubrica")
public class RubricaController {
	
	private RubricaService rubServ = new RubricaService();
	
	// RUBRICA.CONTROLLER:
	
	@PostMapping(path = "/insert_rubrica", consumes = "application/json")
	public boolean inserisci(@RequestBody RubricaDto rDto) {
		return rubServ.inserisci(rDto);
	}
	
	@GetMapping(path = "/cerca/{id}", produces = "application/json")
	public RubricaDto cercaPerId(@PathVariable int id) {
		return rubServ.cercaPerId(id);
	}
	
	@GetMapping(path = "/mostraRubriche", produces = "application/json")
	public List<RubricaDto> mostraRubriche() {
		return rubServ.mostraTutteRub();
	}
	
	@DeleteMapping(path = "/{id}/cancella", produces = "application/json")
	public RubricaDto cancellaRub(@PathVariable int id) {
		return rubServ.cancella(id);
	}
	
	@GetMapping(path = "/{id}/ProprietarioAnno", produces = "application/json")
	public Proprietario_anno_dto visualizza_proprietario_anno(@PathVariable int id) {
		return rubServ.visualizza_proprietario_anno(id);
	}
	
	@PutMapping(path = "/modificaNome/{id}/{nome}", produces = "application/json")
	public RubricaDto updateName(@PathVariable int id, @PathVariable String nome) {
		return rubServ.updateName(id, nome);
	}
	
	@PutMapping(path = "/modificaAnno/{id}/{anno}", produces = "application/json")
	public RubricaDto updateAnnoCreazione(@PathVariable int id, @PathVariable int anno) {
		return rubServ.updateAnnoCreazione(id, anno);
	}
	
	@GetMapping(path = "/nomi_num", produces = "application/json")
	public propNumDto nome_num() {
		return rubServ.nome_num();
	}
	
	@GetMapping(path = "/visualizzaAnni")
	public List<Integer> anniCreazione(){
		return rubServ.anniCreazione();
	}
	
	
	// finire le ultime 3 chiamate di rubrica 
	
//----------------------------------------------------------------------------------------//
	
	// CONTATTI.CONTROLLER:
	
	@PostMapping(path = "/inserisciContatto/{id}", consumes = "application/json")
	public Boolean insertContatto(@PathVariable int id, @RequestBody ContattoTelefonicoDto cDto) {
		return rubServ.insertContatto(id, cDto);
	}
	
	@GetMapping(path = "/{idRubrica}/visualizzaContatto/{id}", produces = "application/json")
	public ContattoTelefonicoDto visualizzaContatto(@PathVariable int idRubrica, @PathVariable int id) {
		return rubServ.visualizzaContatto(idRubrica, id);
	}
	
	@PutMapping(path ="/{idRubrica}/modificaContatto/{id}", produces = "application/json")
	public ContattoTelefonicoDto modificaContatto(@PathVariable int idRubrica, @PathVariable int id, ContattoTelefonicoDto dto) {
		return rubServ.modificaContatto(idRubrica, id, dto);
		
	}
	
	@DeleteMapping(path = "/{idRubrica}/cancellaContatto/{id}", produces = "application/json")
	public ContattoTelefonicoDto cancellaContatto(@PathVariable Integer idRubrica, @PathVariable Integer id) {
		return cancellaContatto(idRubrica, id);
	}
	
	@GetMapping(path = "/{idRub}/contattiRegistrati", produces = "application/json")
	public List<ContattoTelefonicoDto> contattiRegistrati(@PathVariable int idRub) {
		return rubServ.listaContatti(idRub);
	}
	
	@GetMapping(path = "/{idRub}/numContatti", produces = "application/json")
	public int numContatti(@PathVariable int idRub) {
		return rubServ.numContatti(idRub);
	}
	
	@GetMapping(path = "/{idRub}/numContatto/{num}")
	public ContattoTelefonicoDto numContatto( @PathVariable int idRub, @PathVariable int num) {
		return rubServ.numContatto(idRub, num);
	}
	
	@GetMapping(path = "/{idRubrica}/{gruppo}/VisualizzaConGruppo")
	public List<ContNomeCognomeDto> VisualizzaConGruppo( @PathVariable int idRubrica, @PathVariable String gruppo) {
		return rubServ.VisualizzaConGruppo(idRubrica, gruppo);
	}
	
	@GetMapping(path = "/{idRubrica}/{gruppo}/NumeroContattiGruppo")
	public Integer NumeroContattiGruppo( @PathVariable int idRubrica, @PathVariable String gruppo){
		return rubServ.NumeroContattiGruppo(idRubrica, gruppo);
	}
	
	@DeleteMapping(path = "{idRubrica}/{gruppo}/cancellaGruppo", produces = "application/json")
	public List<ContattoTelefonicoDto> CancellaGruppoContatti(@PathVariable int idRubrica, @PathVariable String gruppo){
		return rubServ.CancellaGruppoContatti(idRubrica, gruppo);
	}
	
	@PutMapping(path = "/{idRubrica}/{id}/modificaStato", produces = "application/json")
	public ContattoTelefonicoDto modificaStato(int idRubrica, int id) {
		return rubServ.modificaStato(idRubrica, id);
	}
	
	@GetMapping(path = "/{idRubrica}/Preferiti", produces = "application/json")
	public List<ContattoTelefonicoDto> Preferiti(@PathVariable int idRubrica) {
		return rubServ.Preferiti(idRubrica);
	}
	
}
