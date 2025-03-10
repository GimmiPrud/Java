package com.example.Rubrica.spring.Utility;

import java.util.HashMap;
import java.util.Map;

import com.example.Rubrica.spring.Entity.ContattoTelefonico;
import com.example.Rubrica.spring.Entity.Rubrica;
import com.example.Rubrica.spring.dto.ContattoTelefonicoDto;
import com.example.Rubrica.spring.dto.RubricaDto;

public class Conversioni {
	
	public static Rubrica daRubricaDtoARubrica(RubricaDto dto) {
		
		Map<Integer, ContattoTelefonico> contattiTelefonici = new HashMap<Integer, ContattoTelefonico>();
		
		for (ContattoTelefonicoDto contattoTelefonicoDTO : dto.getLista_contatti().values()) {
			
			contattiTelefonici.put(contattoTelefonicoDTO.getId(), daContattoDtoAContatto(contattoTelefonicoDTO));
		}
		return new Rubrica(dto.getId(), dto.getNome_proprietario(), dto.getAnno_creazione(), contattiTelefonici);    
	}
	
	public static RubricaDto daRubricaARubricaDto(Rubrica rub) {
		Map<Integer, ContattoTelefonicoDto> contattiTelefonici = new HashMap<Integer, ContattoTelefonicoDto>();
		
		for (ContattoTelefonico contattoTelefonico : rub.getLista_contatti().values()) {
			
			contattiTelefonici.put(contattoTelefonico.getId(), daContattoAContattoDto(contattoTelefonico));
		}
		return new RubricaDto(rub.getId(), rub.getNome_proprietario(), rub.getAnno_creazione(), contattiTelefonici);
	}
	
	public static ContattoTelefonico daContattoDtoAContatto(ContattoTelefonicoDto dto) {
		return new ContattoTelefonico(dto.getId(), dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppoDiAppartenenza(), dto.getData_nascita(), dto.getPreferito());
	}
	
	public static ContattoTelefonicoDto daContattoAContattoDto(ContattoTelefonico cont) {
		return new ContattoTelefonicoDto(cont.getId(), cont.getNome(), cont.getCognome(), cont.getNumero(), cont.getGruppoDiAppartenenza(), cont.getData_nascita(), cont.getPreferito());
		
	}
	
}
