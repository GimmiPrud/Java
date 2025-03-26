package com.spring.phoneBook.Service;

import com.spring.phoneBook.Dto.ContattoDto;
import com.spring.phoneBook.Dto.RubricaDto;

public interface RubricaService {
	
	public boolean creaRubrica(RubricaDto rubrica);
	public RubricaDto cercaPerId(Integer idRubrica);
	public boolean aggiungiContatto(Integer idRubrica, ContattoDto contatto);
}
