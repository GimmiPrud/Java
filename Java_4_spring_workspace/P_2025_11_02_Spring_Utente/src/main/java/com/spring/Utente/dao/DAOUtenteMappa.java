package com.spring.Utente.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.Utente.entity.Utente;

public class DAOUtenteMappa {
	
	private Map<Integer, Utente> mappa = new HashMap<>();

	public boolean insert(Utente utente) {
	if(mappa.containsKey(utente.getId()))
	return false;

	mappa.put(utente.getId(), utente);
	return true;

	}
	
	public List<Utente> selectAll(){
	return new ArrayList<>(mappa.values());
	}

	public Utente selectById(Integer idUtente) {
	return mappa.get(idUtente);
	}

	public boolean delete(Integer idUtente) {
	Utente utente = mappa.remove(idUtente);
	return utente!=null;
	}

}
