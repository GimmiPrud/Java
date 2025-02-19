package com.spring.universita.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.universita.Entity.Professore;


public class ProfessoriDAO {
	
	private Map<Integer, Professore> mappa_prof = new HashMap<>();
	
	public boolean insert(Professore prof) {
		if(mappa_prof.containsKey(prof.getID()))
		return false;

		mappa_prof.put(prof.getID(), prof);
		return true;

		}
		
		public List<Professore> selectAll(){
		return new ArrayList<>(mappa_prof.values());
		}

		public Professore selectById(Integer IdProf) {
		return mappa_prof.get(IdProf);
		}

		public boolean delete(Integer IdProf) {
		Professore utente = mappa_prof.remove(IdProf);
		return utente!=null;
		}
}
