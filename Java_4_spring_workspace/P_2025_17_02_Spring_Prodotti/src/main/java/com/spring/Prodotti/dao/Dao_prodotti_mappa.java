package com.spring.Prodotti.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.Prodotti.Entity.Prodotti;

public class Dao_prodotti_mappa {
	
	private Map<Integer, Prodotti> mappa = new HashMap<>();
	
	public boolean insert(Prodotti prodotto) {
	if(mappa.containsKey(prodotto.getID()))
	return false;

	mappa.put(prodotto.getID(), prodotto);
	return true;

	}
	
	public List<Prodotti> selectAll(){
		return new ArrayList<>(mappa.values());
	}
	
	public Prodotti selectById(Integer idProdotto) {
		return mappa.get(idProdotto);
	}

	public boolean delete(Integer idProdotto) {
	Prodotti Prodotto = mappa.remove(idProdotto);
	return Prodotto!=null;
	}
	
}
