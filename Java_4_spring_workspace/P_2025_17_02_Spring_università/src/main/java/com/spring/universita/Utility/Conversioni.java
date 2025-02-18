package com.spring.universita.Utility;

import com.spring.universita.DTO.ProfessoreDTO;
import com.spring.universita.DTO.StudenteDTO;
import com.spring.universita.Entity.Professore;
import com.spring.universita.Entity.Studente;

public class Conversioni {
		
	public static Studente daStudenteDtoAStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getIndirizzo(), dto.getAnno_nascita(), dto.getAnno_immatricolazione());
	}
	
	public static StudenteDTO daStudenteAStudenteDto(Studente studente) {
		return new StudenteDTO(studente.getMatricola(), studente.getNome(), studente.getCognome(), studente.getIndirizzo(), studente.getAnno_nascita(), studente.getAnno_immatricolazione());
	}
	
	public static Professore daProfessoreDtoAProfessore(ProfessoreDTO dto) {
		return new Professore(dto.getID(), dto.getNome(), dto.getCognome(), dto.getMateria_insegnamento());
	}
	
	public static ProfessoreDTO daProfessoreAProfessoreDto(Professore professore) {
		return new ProfessoreDTO(professore.getID(), professore.getNome(), professore.getCognome(), professore.getMateria_insegnamento());
	}
}

