package com.spring.universita.Service;

import java.util.ArrayList;
import java.util.List;


import com.spring.universita.DAO.studentiDAO;
import com.spring.universita.DTO.StudenteDTO;
import com.spring.universita.Entity.Studente;
import com.spring.universita.Utility.Conversioni;

public class StudentiService {
	
	private studentiDAO dao_stu = new studentiDAO();
	
public Boolean registra(StudenteDTO sdto) {
		
		// 1.trasformo il dto in entity 
		Studente entity = Conversioni.daStudenteDtoAStudente(sdto);
		
		// 2.inserisco l'entity attraverso il dao 
		return dao_stu.insert(entity);
	}
	
	public StudenteDTO cercaPerMatricola(int matricola) {
		
		// 1.chiamo il dao 
		Studente studente = dao_stu.selectById(matricola);
		
		if (studente != null) {
			// trasformo
			StudenteDTO dto = Conversioni.daStudenteAStudenteDto(studente);
			return dto;
		}
		return null;
	}
	
	public List<StudenteDTO> mostraTuttiStu() {
		List<Studente> lista = dao_stu.selectAll();
		List<StudenteDTO> listaDto = new ArrayList<>();
		for (Studente studente : lista) {
			listaDto.add(Conversioni.daStudenteAStudenteDto(studente));
		}
		return listaDto;
	}
	
	public StudenteDTO cancella(int matStudente) {
		Studente studente = dao_stu.selectById(matStudente);
		
		if(studente != null) {
			dao_stu.delete(matStudente);
			return Conversioni.daStudenteAStudenteDto(studente);
		}
		return null;
	}
	
	public StudenteDTO updateIndirizzo(int matStudente, String indirizzo) {
		Studente studente = dao_stu.selectById(matStudente);
		
		if(studente != null) {
			studente.setIndirizzo(indirizzo);
			return Conversioni.daStudenteAStudenteDto(studente);
		}
		return null;	
	}
	

}
