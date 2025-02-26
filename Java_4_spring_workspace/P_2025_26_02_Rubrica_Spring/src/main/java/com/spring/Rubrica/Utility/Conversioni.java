package com.spring.Rubrica.Utility;

import com.spring.Rubrica.Entity.ContattoTelefonico;
import com.spring.Rubrica.Entity.Rubrica;
import com.spring.Rubrica.dto.ContattoTelefonicoDto;
import com.spring.Rubrica.dto.RubricaDto;

public class Conversioni {
	
	public static Rubrica daRubricaDtoARubrica(RubricaDto dto) {
		return new Rubrica(dto.getId(), dto.getNome_proprietario(), dto.getAnno_creazione());    
	}
	
	public static RubricaDto daRubricaARubricaDto(Rubrica rub) {
		return new RubricaDto(rub.getId(), rub.getNome_proprietario(), rub.getAnno_creazione());
	}
	
	public static ContattoTelefonico daContattoDtoAContatto(ContattoTelefonicoDto dto) {
		return new ContattoTelefonico(dto.getId(), dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppoDiAppartenenza(), dto.getData_nascita(), dto.getPreferito());
	}
	
	public static ContattoTelefonicoDto daContattoAContattoDto(ContattoTelefonico cont) {
		return new ContattoTelefonicoDto(cont.getId(), cont.getNome(), cont.getCognome(), cont.getNumero(), cont.getGruppoDiAppartenenza(), cont.getData_nascita(), cont.getPreferito());
		
	}
}

