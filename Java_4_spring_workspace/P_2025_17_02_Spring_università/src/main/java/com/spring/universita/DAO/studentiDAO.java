package com.spring.universita.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.universita.Entity.Studente;


public class studentiDAO {
	
	private Map<Integer, Studente> mappa_studente = new HashMap<>();

	public boolean insert(Studente stu) {
	if(mappa_studente.containsKey(stu.getMatricola()))
	return false;

	mappa_studente.put(stu.getMatricola(), stu);
	return true;

	}
	
	public List<Studente> selectAll(){
	return new ArrayList<>(mappa_studente.values());
	}

	public Studente selectById(Integer matStu) {
	return mappa_studente.get(matStu);
	}

	public boolean delete(Integer matStu) {
	Studente utente = mappa_studente.remove(matStu);
	return utente!=null;
	}
}
