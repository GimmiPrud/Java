package com.spring.Utente.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.Utente.Dto.NomeCognomeDTO;
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
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		if(utente != null) {
			return new NomeCognomeDTO(utente.getNome(), utente.getCognome());
		}
		return null;
	}

	public List<UtenteDTO> mostraTutti() {
		List<Utente> lista = dao.selectAll();
		List<UtenteDTO> listaDto = new ArrayList<>();
		for (Utente utente : lista) {
			listaDto.add(Conversioni.daUtenteAdAUtenteDto(utente));
		}
		return listaDto;
	}

	public UtenteDTO updatePassword(int idUtente, String password) {
		Utente utente = dao.selectById(idUtente);
		if(utente != null) {
			utente.setPassword(password);
			return Conversioni.daUtenteAdAUtenteDto(utente);
		}
		return null;
	}
	public UtenteDTO cancella(int idUtente) {
		Utente utente = dao.selectById(idUtente);
		if(utente != null) {
			dao.delete(idUtente);
			return Conversioni.daUtenteAdAUtenteDto(utente);
		}
		return null;
	}
	
	
}
