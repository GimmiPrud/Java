package com.example.Rubrica.spring.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.Rubrica.spring.Entity.ContattoTelefonico;
import com.example.Rubrica.spring.Entity.Rubrica;
import com.example.Rubrica.spring.Utility.Conversioni;
import com.example.Rubrica.spring.dao.RubricaDao;
import com.example.Rubrica.spring.dto.ContattoTelefonicoDto;
import com.example.Rubrica.spring.dto.Proprietario_anno_dto;
import com.example.Rubrica.spring.dto.RubricaDto;
import com.example.Rubrica.spring.dto.propNumDto;


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
		
		public List<RubricaDto> mostraTutteRub() {
			List<Rubrica> lista = dao_rub.selectAll();
			List<RubricaDto> listaDto = new ArrayList<>();
			for (Rubrica rubrica : lista) {
				listaDto.add(Conversioni.daRubricaARubricaDto(rubrica));
			}
			return listaDto;
		}
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
		
		public Proprietario_anno_dto visualizza_proprietario_anno(int id) {
			Rubrica rubrica = dao_rub.selectById(id);
			
			if (rubrica!=null) {
				return new Proprietario_anno_dto(rubrica.getNome_proprietario(), rubrica.getAnno_creazione());
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
		
		public propNumDto nome_num() {
			List<Rubrica> lista = dao_rub.selectAll();
			List<String> l = new LinkedList<String>();
			for (Rubrica rub : lista) {
				l.add(rub.getNome_proprietario());
			}
			return new propNumDto(l, l.size());
		}
//----------------------------------------------------------------//
		
		// finire le altre 2 chiamate di rubrica:

		
		
		// CONTATTI:
		
		
			
}