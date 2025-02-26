package com.spring.Rubrica.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.Rubrica.Entity.Rubrica;

public class RubricaDao {
	
private Map<Integer, Rubrica> map_rubrica = new HashMap<>();
	
	public boolean insert(Rubrica rub) {
		if(map_rubrica.containsKey(rub.getId()))
		return false;

		map_rubrica.put(rub.getId(), rub);
		return true;

		}
		
		public List<Rubrica> selectAll(){
		return new ArrayList<>(map_rubrica.values());
		}

		public Rubrica selectById(Integer IdRub) {
		return map_rubrica.get(IdRub);
		}

		public boolean delete(Integer IdRub) {
		Rubrica rubrica = map_rubrica.remove(IdRub);
		return rubrica!=null;
		}
}
