package com.spring.Ecommerce.Service;

import com.spring.Ecommerce.Dto.DatiBaseVenditoreDto;
import com.spring.Ecommerce.Dto.ProdottoDto;
import com.spring.Ecommerce.Dto.VenditoreDto;

public interface EcommerceServiceInterface {
	
	public boolean inserisciVenditore(VenditoreDto venditore);
	public VenditoreDto cercaPerId(Integer idVenditore);
	public DatiBaseVenditoreDto datiVenditore(Integer idVenditore);
	public String updatePassword(Integer idVenditore, String newPassword);
	public String addProdotto(Integer idVenditore, ProdottoDto prodotto);
	public VenditoreDto updateQuantità(Integer idVenditore, Integer idProdotto, Integer quantita);
}
