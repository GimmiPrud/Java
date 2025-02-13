package com.spring.Utente.Utility;

import com.spring.Utente.Dto.UtenteDTO;
import com.spring.Utente.entity.Utente;

public class Conversioni {
	
	public static Utente daUtenteDtoAUtente(UtenteDTO dto) {
		return new Utente(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword());
	}
	
	public static UtenteDTO daUtenteAdAUtenteDto(Utente utente) {
		return new UtenteDTO(utente.getId(), utente.getNome(), utente.getCognome(), utente.getUsername(), utente.getPassword());
	}
}
