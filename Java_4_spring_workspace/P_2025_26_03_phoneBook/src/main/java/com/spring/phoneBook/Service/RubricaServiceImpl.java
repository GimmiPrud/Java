package com.spring.phoneBook.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.phoneBook.Dao.DaoRubrica;
import com.spring.phoneBook.Dto.ContattoDto;
import com.spring.phoneBook.Dto.RubricaDto;
import com.spring.phoneBook.Entity.Rubrica;
import com.spring.phoneBook.Utility.Conversioni;

@Service
@Transactional
public class RubricaServiceImpl implements RubricaService {
	
	@Autowired
	private DaoRubrica dao;

	@Override
	public boolean creaRubrica(RubricaDto rubrica) {
		// transf 
		Rubrica rub = Conversioni.daRubricaDtoARubrica(rubrica);
		dao.save(rub);
		return true;
	}

	@Override
	public RubricaDto cercaPerId(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica trovata = opt.get();
			return Conversioni.daRubricaARubricaDto(trovata);
		} else {
			throw new RuntimeException("Id rubrica non trovata");
		}
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDto contatto) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica trovata = opt.get();
			trovata.addContatto(Conversioni.daContattoDtoAContatto(contatto));
			return true;
		}
		return false;
	}

}
