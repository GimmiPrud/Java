package com.spring.Rubrica.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.Rubrica.Entity.Rubrica;
import com.spring.Rubrica.Utility.Conversioni;
import com.spring.Rubrica.dao.RubricaDao;
import com.spring.Rubrica.dto.RubricaDto;
import com.spring.Rubrica.dto.proprietario_anno_dto;



public class RubricaService {
	
// RUBRICA:
private RubricaDao dao_rub = new RubricaDao();
	
	public Boolean inserisci(RubricaDto rdto) {
			Rubrica entity = Conversioni.daRubricaDtoARubrica(rdto);
			return dao_rub.insert(entity);
		}
//----------------------------------------------------------------------//
	
		public RubricaDto cercaPerId(int id) {
			Rubrica rubrica = dao_rub.selectById(id);
			if (rubrica != null) {
				RubricaDto dto = Conversioni.daRubricaARubricaDto(rubrica);
				return dto;
			}
			return null;
		}
//--------------------------------------------------------------------//
		
		public List<RubricaDto> mostraTutti() {
			List<Rubrica> lista = dao_rub.selectAll();
			List<RubricaDto> listaDto = new ArrayList<>();
			for (Rubrica rubrica : lista) {
				listaDto.add(Conversioni.daRubricaARubricaDto(rubrica));
			}
			return listaDto;
		}
//-------------------------------------------------------------------//
		
//		public List<String> mostraNomi_proprietari(){
//			int count = 0;
//			List<Rubrica> lista = dao_rub.selectAll();
//			
//			
//		}
//-----------------------------------------------------------------//
		
		public RubricaDto cancella(int id) {
			Rubrica rubrica = dao_rub.selectById(id);
		
			if(rubrica != null) {
				dao_rub.delete(id);
				return Conversioni.daRubricaARubricaDto(rubrica);
			}
			return null;
		}
//-------------------------------------------------------------------//
		
		public proprietario_anno_dto visualizza_proprietario_anno(int id) {
			Rubrica rubrica = dao_rub.selectById(id);
			
			if (rubrica!=null) {
				return new proprietario_anno_dto(rubrica.getNome_proprietario(), rubrica.getAnno_creazione());
			}
			return null;
		}
//-------------------------------------------------------------------//
		
		public RubricaDto updateName(int id, String nome) {
			Rubrica rubrica = dao_rub.selectById(id);
			
			if(rubrica != null) {
				rubrica.setNome_proprietario(nome);
				return Conversioni.daRubricaARubricaDto(rubrica);
			}
			return Conversioni.daRubricaARubricaDto(rubrica);
		}
//------------------------------------------------------------------//
		
		public RubricaDto updateAnnoCreazione(int id, int anno) {
			Rubrica rubrica = dao_rub.selectById(id);
			
			if(rubrica != null) {
				rubrica.setAnno_creazione(anno);
				return Conversioni.daRubricaARubricaDto(rubrica);
			}
			return Conversioni.daRubricaARubricaDto(rubrica);
		}
//----------------------------------------------------------------//
		
		
		
}
