package com.example.Rubrica.spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rubrica.spring.dto.ContattoTelefonicoDto;
import com.example.Rubrica.spring.dto.Proprietario_anno_dto;
import com.example.Rubrica.spring.dto.RubricaDto;
import com.example.Rubrica.spring.dto.propNumDto;
import com.example.Rubrica.spring.service.RubricaService;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/rubrica")
public class RubricaController {
	
	private RubricaService rubServ = new RubricaService();
	
	@GetMapping(path = "/insert_rubrica", consumes = "application/json")
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
	
	@GetMapping(path = "/cancella/{id}", produces = "application/json")
	public RubricaDto cancellaRub(@PathVariable int id) {
		return rubServ.cancella(id);
	}
	
	@GetMapping(path = "/ProprietarioAnno/{id}", produces = "application/json")
	public Proprietario_anno_dto visualizza_proprietario_anno(@PathVariable int id) {
		return rubServ.visualizza_proprietario_anno(id);
	}
	
	@GetMapping(path = "/modificaNome/{id}/{nome}", produces = "application/json")
	public RubricaDto updateName(@PathVariable int id, @PathVariable String nome) {
		return rubServ.updateName(id, nome);
	}
	
	@GetMapping(path = "/modificaAnno/{id}/{anno}", produces = "application/json")
	public RubricaDto updateAnnoCreazione(@PathVariable int id, @PathVariable int anno) {
		return rubServ.updateAnnoCreazione(id, anno);
	}
	
	@GetMapping(path = "/nomi_num", produces = "application/json")
	public propNumDto nome_num() {
		return rubServ.nome_num();
	}
	
	// finire le ultime 2 chiamate di rubrica 
	
	
	
	// CONTATTI.CONTROLLER:
	
}
