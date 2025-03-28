package com.spring.Ecommerce.Utility;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.Ecommerce.Dto.ProdottoDto;
import com.spring.Ecommerce.Dto.VenditoreDto;
import com.spring.Ecommerce.Entity.Prodotto;
import com.spring.Ecommerce.Entity.Venditore;

public class Conversioni {
	
	
	public static Prodotto daProdottoDtoAProdotto(ProdottoDto dto) {
		return new Prodotto(dto.getId(), dto.getDescrizione(), dto.getQuantita(), dto.getPrezzo(), dto.getSconto(), dto.getCategoria());
	}
	
	public static ProdottoDto DaProdottoAProdottoDto(Prodotto prod) {
		return new ProdottoDto(prod.getId(), prod.getDescrizione(), prod.getQuantita(), prod.getPrezzo(), prod.getSconto(), prod.getCategoria());
	}
	
	
	public static Venditore DaVenditoreDtoaVenditore(VenditoreDto dto) {
		Venditore venditore =  new Venditore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword(), dto.getVia(), dto.getCitta());
		
		List<ProdottoDto> listaProd = dto.getProdottiVendesi();
		
		List<Prodotto> lista = listaProd.stream()
				.map(prodottoD -> Conversioni.daProdottoDtoAProdotto(prodottoD))
				.collect(Collectors.toList());
		
		venditore.setProdottiVendesi(lista);
		return venditore;
	}
	
	public static VenditoreDto DaVenditoreaVenditoreDto(Venditore ven) {
		VenditoreDto venDto =  new VenditoreDto(ven.getId(), ven.getNome(), ven.getCognome(), ven.getUsername(), ven.getPassword(), ven.getVia(), ven.getCitta());
		
		List<Prodotto> listaProd = ven.getProdottiVendesi();
		
		List<ProdottoDto> listaD = listaProd.stream()
				.map(prodotto -> Conversioni.DaProdottoAProdottoDto(prodotto))
				.collect(Collectors.toList());
		
		venDto.setProdottiVendesi(listaD);
		return venDto;
	}
	
}
