package com.spring.studentiHibernate.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.studentiHibernate.Dto.StudenteDto;
import com.spring.studentiHibernate.Entity.Studenti;
import com.spring.studentiHibernate.dao.DaoStudente;


@Service
@Transactional
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private DaoStudente dao;
	
	
	// aggiungo uno studente 
	@Override
	public boolean immatricola(StudenteDto dto) {
		// transf 
		Studenti st = new Studenti(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getAnnoImmatricolazione());
		Optional<Studenti> opt = dao.findById(dto.getMatricola());
		if (opt.isPresent()){
			return false;
		} else {
			dao.save(st);
			return true;
		}
		
	}
	
	// cerco uno studente 
	@Override
	public StudenteDto cerca(Integer matricola) {
		Optional<Studenti> opt = dao.findById(matricola);
		if (opt.isPresent()) {
			Studenti st = opt.get();
			return new StudenteDto(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImmatricolazione());
		}
		return null;
	}
	
	
	
	
}
