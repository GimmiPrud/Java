package com.example.Rubrica.spring.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import com.example.Rubrica.spring.Entity.ContattoTelefonico;
import com.example.Rubrica.spring.Entity.Rubrica;
import com.example.Rubrica.spring.Utility.Conversioni;
import com.example.Rubrica.spring.dao.RubricaDao;
import com.example.Rubrica.spring.dto.ContNomeCognomeDto;
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
			} else {
				throw new RuntimeException("Errore. Nessun contatto trovato");
			}
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
		
		public List<Integer> anniCreazione() {
			List<Rubrica> lista = dao_rub.selectAll();
			List<Integer> l = new LinkedList<Integer>();
			for (Rubrica rub : lista) {
				if (rub != null) {
					l.add(rub.getAnno_creazione());
				} else {
					throw new RuntimeException("errore rubrica non trovata ");
				}
			}
			Collections.sort(l);
			return l;
		}
		
//--------------------------------------------------------------------------------------//
		
		
		
		// CONTATTI:
		
		public Boolean insertContatto(int id, ContattoTelefonicoDto cDto) {
			Rubrica rubrica = dao_rub.selectById(id);
			ContattoTelefonico co = Conversioni.daContattoDtoAContatto(cDto);
			if (rubrica.getLista_contatti().containsKey(co.getId())) {
				throw new RuntimeException("Contatto già esistente");
			}
			rubrica.getLista_contatti().put(co.getId(), co);
			return true;
		}

//-------------------------------------------------------------------------------------//
		
		public ContattoTelefonicoDto visualizzaContatto(int idRubrica, int id) {
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ContattoTelefonicoDto dto = new ContattoTelefonicoDto();
			if (rubrica != null) {
				ContattoTelefonico contatto = rubrica.getLista_contatti().get(id);
				if (contatto != null) {
					dto = Conversioni.daContattoAContattoDto(contatto);

				} else {
					throw new RuntimeException("Impossibile visualizzare il contatto.Id contatto non trovato");
				}
			}
			return dto;
		}

//--------------------------------------------------------------------------------------//
		
		public ContattoTelefonicoDto modificaContatto(int idRubrica, int id, ContattoTelefonicoDto dto) {
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ContattoTelefonicoDto dtoo = new ContattoTelefonicoDto();
			if (rubrica != null) {
				ContattoTelefonico contatto = rubrica.getLista_contatti().get(id);
				if (contatto != null) {
					contatto.setNome(dto.getNome());
					contatto.setCognome(dto.getCognome());
					contatto.setNumero(dto.getNumero());
					contatto.setGruppoDiAppartenenza(dto.getGruppoDiAppartenenza());
					contatto.setData_nascita(dto.getData_nascita());
					contatto.setPreferito(dto.getPreferito());

					rubrica.getLista_contatti().put(id, contatto);
					dtoo = Conversioni.daContattoAContattoDto(contatto);
				} else {
					throw new RuntimeException("Impossibile modificare. Id contatto non trovato");
				}
			}
			return dtoo;
		}
		
//---------------------------------------------------------------------------------------------//
		
		public ContattoTelefonicoDto cancellaContatto(Integer idRubrica, Integer id) {
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ContattoTelefonicoDto dto = new ContattoTelefonicoDto();
			if (rubrica != null) {
				ContattoTelefonico contatto = rubrica.getLista_contatti().get(id);
				if (contatto != null) {
					rubrica.getLista_contatti().remove( id, contatto);
					return Conversioni.daContattoAContattoDto(contatto);
				}else {
					throw new RuntimeException("Impossibile rimuovere. Id contatto non trovato");
				}
			}
			return dto;	
		}
		
//-------------------------------------------------------------------------------------------------//
		
		public List<ContattoTelefonicoDto> listaContatti(int idRubrica){
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ArrayList<ContattoTelefonicoDto> Cdto = new ArrayList<ContattoTelefonicoDto>();
			ArrayList<ContattoTelefonico> l = new ArrayList<ContattoTelefonico>(rubrica.getLista_contatti().values());
			if (rubrica!= null) {
				for (ContattoTelefonico cont : l) {
					ContattoTelefonicoDto dto = Conversioni.daContattoAContattoDto(cont);
					Cdto.add(dto);
				}
			}
			return Cdto;
			
		}

//----------------------------------------------------------------------------------------------------//
		
		public Integer numContatti(int idRub) {
			Rubrica rubrica = dao_rub.selectById(idRub);
			int size = 0;
			if (rubrica!= null) {
				size = rubrica.getLista_contatti().size();
			} if (size != 0) {
				return size;
			} else {
				throw new RuntimeException("Non ci sono contatti");
			}
		}	

//-------------------------------------------------------------------------------------------------//
		
		public ContattoTelefonicoDto numContatto(int idRub, int num) {
			Rubrica rubrica = dao_rub.selectById(idRub);
			ContattoTelefonicoDto c = new ContattoTelefonicoDto();
			if (rubrica!= null) {
				for ( ContattoTelefonico con : rubrica.getLista_contatti().values()) {
					if (con.getNumero() == num) {
						c = Conversioni.daContattoAContattoDto(con);
					}else {
						throw new RuntimeException("Contatto non trovato");
					}
				}
			}
			return c;
		}
	
//-------------------------------------------------------------------------------------------//
		
		public List<ContNomeCognomeDto> VisualizzaConGruppo(int idRubrica, String gruppo) {
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ArrayList<ContNomeCognomeDto> contatti = new ArrayList<ContNomeCognomeDto>();
			if (rubrica != null) {
				for (ContattoTelefonico contatto : rubrica.getLista_contatti().values()) {
						if (contatto.getGruppoDiAppartenenza().equals(gruppo)) {
							ContattoTelefonicoDto dto = Conversioni.daContattoAContattoDto(contatto);
							contatti.add(new ContNomeCognomeDto(dto.getNome(), dto.getCognome()));
						}
				}
			} if(contatti.size() != 0) {
				return contatti;
			} else {
				throw new RuntimeException("Lista vuota.Contatti non trovati dentro il gruppo di appartenenza.");
			}
			
		}
		
//-------------------------------------------------------------------------------------------//
		
		public Integer NumeroContattiGruppo(int idRubrica, String gruppo) {
			ArrayList<ContattoTelefonico> contatti = new ArrayList<ContattoTelefonico>();
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			if (rubrica != null) {
				for (ContattoTelefonico contatto : rubrica.getLista_contatti().values()) {
					if (contatto.getGruppoDiAppartenenza().equals(gruppo)) {
						contatti.add(contatto);
					}
				}
			}if(contatti.size() != 0) {
				return contatti.size();
			}else {
				throw new RuntimeException("Impossibile eliminare i contatti.Contatti non trovati dentro il gruppo di appartenenza.");
			}
		}
//-------------------------------------------------------------------------------------------//
		
		public List<ContattoTelefonicoDto> CancellaGruppoContatti(int idRubrica, String gruppo) {
			ArrayList<ContattoTelefonicoDto> contatti = new ArrayList<ContattoTelefonicoDto>();
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			if (rubrica != null) {
				for (ContattoTelefonico contatto : rubrica.getLista_contatti().values()) {
						if (contatto.getGruppoDiAppartenenza().equals(gruppo)) {
							ContattoTelefonicoDto dto = Conversioni.daContattoAContattoDto(contatto);
							rubrica.getLista_contatti().remove(contatto.getId(), contatto);
							contatti.add(dto);
						}
					} 
			} if(contatti.size() != 0) {
				return contatti;
			}else {
				throw new RuntimeException("Impossibile eliminare i contatti.Contatti non trovati dentro il gruppo di appartenenza.");
			}

		}
//-------------------------------------------------------------------------------------------//
		
		public ContattoTelefonicoDto modificaStato(int idRubrica, int id) {
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			ContattoTelefonicoDto dto = new ContattoTelefonicoDto();
			if (rubrica != null) {
				ContattoTelefonico contatto = rubrica.getLista_contatti().get(id);
				if (contatto != null) {
					contatto.setPreferito(true);
					dto = Conversioni.daContattoAContattoDto(contatto);
				} else {
					throw new RuntimeException("Impossibile modificare lo stato preferito del contatto.Contatto non trovato");
				}
			}
			return dto;

		}
//-------------------------------------------------------------------------------------------//
		
		public List<ContattoTelefonicoDto> Preferiti(int idRubrica) {
			ArrayList<ContattoTelefonicoDto> preferiti = new ArrayList<ContattoTelefonicoDto>();
			Rubrica rubrica = dao_rub.selectById(idRubrica);
			if (rubrica != null) {
				for (ContattoTelefonico contatto : rubrica.getLista_contatti().values()) {
					ContattoTelefonicoDto dto = Conversioni.daContattoAContattoDto(contatto);
					if (dto.getPreferito() == true) {
						preferiti.add(dto);
					}
				}
			}if (preferiti.size() != 0) {
				return preferiti;
			}else {
				throw new RuntimeException("Lista di contatti preferiti vuota.");
			}
			
		}
		
		
}