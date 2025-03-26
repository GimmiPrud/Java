package com.spring.studentiHibernate.Service;

import java.util.List;

import com.spring.studentiHibernate.Dto.StudenteDto;
import com.spring.studentiHibernate.Entity.Studenti;

public interface StudenteService {
	
	public boolean immatricola(StudenteDto studente);
	public StudenteDto cerca(Integer matricola);
	public List<StudenteDto> getGiovani(Integer anno_immatricolazione);
	public String elimina(Integer matricola);
	public List<StudenteDto> visualizzaTutti();
	
	
}
