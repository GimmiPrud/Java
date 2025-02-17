package com.spring.Prodotti.Utility;

import java.util.Collection;

import com.spring.Prodotti.DTO.Prodotti_DTO;
import com.spring.Prodotti.DTO.ProdottoNoIdDTO;
import com.spring.Prodotti.DTO.Report_DTO;
import com.spring.Prodotti.Entity.Prodotti;

public class Conversioni {

	
	public static Prodotti daProdottoDtoAProdotto(Prodotti_DTO dto) {
		return new Prodotti(dto.getID(), dto.getMarca(), dto.getModello(), dto.getDescrizione(), dto.getPrezzo_consigliato(), dto.getPrezzo_massimo(), dto.getQuantità(), dto.getCategoria());
	}
	
	public static Prodotti_DTO daProdottoAdProdottoDto(Prodotti prodotto) {
		return new Prodotti_DTO(prodotto.getID(), prodotto.getMarca(), prodotto.getModello(), prodotto.getDescrizione(), prodotto.getPrezzo_consigliato(), prodotto.getPrezzo_massimo(), prodotto.getQuantità(), prodotto.getCategoria());
	}
	
	public static Report_DTO generaReportDaProdotti(Collection<Prodotti> prodotti) {
		return null; 
	}
	
	public static ProdottoNoIdDTO daProdottoAProdottoNoIdDTO(Prodotti prodotto) {
		return new ProdottoNoIdDTO(prodotto.getMarca(), prodotto.getModello(), prodotto.getDescrizione(), prodotto.getPrezzo_consigliato(), prodotto.getPrezzo_massimo(), prodotto.getQuantità(), prodotto.getCategoria());
	}
	
}

