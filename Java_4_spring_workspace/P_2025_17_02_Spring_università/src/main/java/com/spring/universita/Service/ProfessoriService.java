package com.spring.universita.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.universita.DAO.ProfessoriDAO;
import com.spring.universita.DTO.ProfessoreDTO;
import com.spring.universita.Entity.Professore;
import com.spring.universita.Utility.Conversioni;


public class ProfessoriService {
	
	private ProfessoriDAO dao_prof = new ProfessoriDAO();
	
	public Boolean registra(ProfessoreDTO pdto) {
			
			// 1.trasformo il dto in entity 
			Professore entity = Conversioni.daProfessoreDtoAProfessore(pdto);
			
			// 2.inserisco l'entity attraverso il dao 
			return dao_prof.insert(entity);
		}
		
		public ProfessoreDTO cercaPerId(int id) {
			
			// 1.chiamo il dao 
			Professore professore = dao_prof.selectById(id);
			
			if (professore != null) {
				// trasformo
				ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDto(professore);
				return dto;
			}
			return null;
		}
		
		public List<ProfessoreDTO> mostraTuttiProf() {
			List<Professore> lista = dao_prof.selectAll();
			List<ProfessoreDTO> listaDto = new ArrayList<>();
			for (Professore professore : lista) {
				listaDto.add(Conversioni.daProfessoreAProfessoreDto(professore));
			}
			return listaDto;
		}
		
		public ProfessoreDTO cancella(int id) {
			Professore professore = dao_prof.selectById(id);
			
			if(professore != null) {
				dao_prof.delete(id);
				return Conversioni.daProfessoreAProfessoreDto(professore);
			}
			return null;
		}
		
		public ProfessoreDTO updateMateria(int id, String materia) {
			Professore professore = dao_prof.selectById(id);
			
			if(professore != null) {
				professore.setMateria_insegnamento(materia);
				return Conversioni.daProfessoreAProfessoreDto(professore);
			}
			return null;	
		}
		
}
