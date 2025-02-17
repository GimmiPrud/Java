package com.spring.Prodotti.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.Prodotti.DTO.Prodotti_DTO;
import com.spring.Prodotti.DTO.ProdottoNoIdDTO;
import com.spring.Prodotti.Entity.Prodotti;
import com.spring.Prodotti.Utility.Conversioni;
import com.spring.Prodotti.dao.Dao_prodotti_mappa;


public class Prodotti_service {
	
	private Dao_prodotti_mappa dao = new Dao_prodotti_mappa();
	
	public Boolean registra(Prodotti_DTO pdto) {
			
			// 1.trasformo il dto in entity 
			Prodotti entity = Conversioni.daProdottoDtoAProdotto(pdto);
			
			// 2.inserisco l'entity attraverso il dao 
			return dao.insert(entity);
		}
		
		public Prodotti_DTO cercaPerId(int id) {
			
			// 1.chiamo il dao 
			Prodotti prodotto = dao.selectById(id);
			
			if (prodotto != null) {
				// trasformo
				Prodotti_DTO dto = Conversioni.daProdottoAdProdottoDto(prodotto);
				return dto;
			}
			return null;
		}
		
		public List<Prodotti_DTO> mostraTutti() {
			List<Prodotti> lista = dao.selectAll();
			List<Prodotti_DTO> listaDto = new ArrayList<>();
			for (Prodotti prodotto : lista) {
				listaDto.add(Conversioni.daProdottoAdProdottoDto(prodotto));
			}
			return listaDto;
		}
		
		public List<ProdottoNoIdDTO> mostraTuttiNoId(){
			List<Prodotti> lista = dao.selectAll();
			List<ProdottoNoIdDTO> listaDtoNoId = new ArrayList<>();
			for (Prodotti prodotto : lista) {
				listaDtoNoId.add(Conversioni.daProdottoAProdottoNoIdDTO(prodotto));
			}
			return listaDtoNoId;
			
		}
		
		public List<String> descrizioneProdotti(){
			List<Prodotti> lista = dao.selectAll();
			List<String> lista_desc = new ArrayList<>();
			for (Prodotti prodotto : lista) {
				lista_desc.add(prodotto.getDescrizione());
			}
			return lista_desc;
		}
		
		public int pezziTotali() {
			int sum = 0;
			List<Prodotti> lista = dao.selectAll();
			List<ProdottoNoIdDTO> listaDtoNoId = new ArrayList<>();
			for (Prodotti prodotto : lista) {
				listaDtoNoId.add(Conversioni.daProdottoAProdottoNoIdDTO(prodotto));
				sum += prodotto.getQuantità();
			}
			return sum;
		}
		
		public List<String> prodottiNonDisponibili(){
			List<Prodotti> lista = dao.selectAll();
			List<String> lista_No = new ArrayList<>();
			for (Prodotti prodotto : lista) {
				if (prodotto.getQuantità()<=0) {
					lista_No.add(prodotto.getMarca());
					lista_No.add(prodotto.getModello());
				}
			}
			return lista_No;
		}
		
		public int TotNonDisponibili(){
			int tot = 0;
			List<Prodotti> lista = dao.selectAll();
			for (Prodotti prodotto : lista) {
				if (prodotto.getQuantità()<=0) {
					tot += 1;
				}
			}
			return tot;
		}
		
		public double media_pezzi() {
			Double med = (double) 0;
			List<Prodotti> lista = dao.selectAll();
			for (Prodotti prodotto : lista) {
				med += prodotto.getPrezzo_massimo();
			}
			return (med / lista.size());
		}
		
}
