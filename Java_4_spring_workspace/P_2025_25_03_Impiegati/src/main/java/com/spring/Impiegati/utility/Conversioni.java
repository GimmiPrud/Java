package com.spring.Impiegati.utility;

import com.spring.Impiegati.Dto.impiegatiDto;
import com.spring.Impiegati.Entity.Impiegati;

public class Conversioni {
	
	public static Impiegati daImpiegatoDtoAImpiegato(impiegatiDto dto) {
		return new Impiegati(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getSalarioMensile());
	}
	
	public static impiegatiDto daImpiegatoAImpiegatoDto(Impiegati impiegato) {
		return new impiegatiDto(impiegato.getMatricola(), impiegato.getNome(), impiegato.getCognome(), impiegato.getSalarioMensile());
	}
}
