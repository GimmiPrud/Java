package com.spring.Utente.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.Utente.Dto.UtenteDTO;
import com.spring.Utente.Utility.Conversioni;
import com.spring.Utente.dao.DAOUtenteMappa;
import com.spring.Utente.entity.Utente;

public class Utente_Service {
	
	private DAOUtenteMappa dao = new DAOUtenteMappa(); // creazione della mappa vuota dentro il dao 
	
	public Boolean registra(UtenteDTO udto) {
		
		// 1.trasformo il dto in entity 
		Utente entity = Conversioni.daUtenteDtoAUtente(udto);
		
		// 2.inserisco l'entity attraverso il dao 
		return dao.insert(entity);
	}
	
	public UtenteDTO cercaPerId(int id) {
		
		// 1.chiamo il dao 
		Utente utente = dao.selectById(id);
		
		if (utente != null) {
			// trasformo
			UtenteDTO dto = Conversioni.daUtenteAdAUtenteDto(utente);
			return dto;
		}
		return null;
		
	}
	
}
