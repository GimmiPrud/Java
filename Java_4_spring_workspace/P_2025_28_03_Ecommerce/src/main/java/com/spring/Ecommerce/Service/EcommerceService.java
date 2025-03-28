package com.spring.Ecommerce.Service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Ecommerce.Dao.DaoEcommerce;
import com.spring.Ecommerce.Dto.DatiBaseVenditoreDto;
import com.spring.Ecommerce.Dto.ProdottoDto;
import com.spring.Ecommerce.Dto.VenditoreDto;
import com.spring.Ecommerce.Entity.Prodotto;
import com.spring.Ecommerce.Entity.Venditore;
import com.spring.Ecommerce.Utility.Conversioni;

@Service
@Transactional
public class EcommerceService implements EcommerceServiceInterface {
	
	@Autowired
	private DaoEcommerce dao;
	

	@Override
	public boolean inserisciVenditore(VenditoreDto venditore) {
		Venditore newVenditore = Conversioni.DaVenditoreDtoaVenditore(venditore);
		dao.save(newVenditore);
		return true;
		
	}
//-----------------------------------------------------------------------\\
	
	@Override
	public VenditoreDto cercaPerId(Integer idVenditore) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if(opt.isPresent()) {
			Venditore vend = opt.get();
			return Conversioni.DaVenditoreaVenditoreDto(vend);
		} else {
			throw new RuntimeException("venditore non trovato");
		}
	}
//--------------------------------------------------------------------------\\
	
	@Override
	public DatiBaseVenditoreDto datiVenditore(Integer idVenditore) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if(opt.isPresent()) {
			Venditore vend = opt.get();
			return new DatiBaseVenditoreDto(vend.getId(), vend.getNome(), vend.getCognome(), vend.getUsername(), vend.getPassword(), vend.getVia(), vend.getCitta());
		} else {
			throw new RuntimeException("id venditore non trovato");
		}
	}
//----------------------------------------------------------------------------\\
	
	@Override
	public String updatePassword(Integer idVenditore, String newPassword) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if(opt.isPresent()) {
			Venditore vend = opt.get();
			vend.setPassword(newPassword);
			return "Password modificata con successo";
		}else {
			throw new RuntimeException("Non è stato possibile modificare la password, id venditore non trovato");
		}
	}
//----------------------------------------------------------------------------\\

	@Override
	public String addProdotto(Integer idVenditore, ProdottoDto prodotto) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if(opt.isPresent()) {
			Venditore vend = opt.get();
			Prodotto p = Conversioni.daProdottoDtoAProdotto(prodotto);
			if(vend.getProdottiVendesi().contains(p)== false) {
				vend.getProdottiVendesi().add(p);
				return "prodotto aggiunto con successo";
			} else {
				
				throw new RuntimeException("id venditore non trovato");
			}
		}
		return null;
	}
//-------------------------------------------------------------------------------\\
	@Override
	public VenditoreDto updateQuantità(Integer idVenditore, Integer idProdotto, Integer quantita) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if(opt.isPresent()) {
			Venditore vend = opt.get();
			for(Prodotto p: vend.getProdottiVendesi()) {
				if(p.getId()== idProdotto) {
					p.setQuantita(quantita);
					return Conversioni.DaVenditoreaVenditoreDto(vend);
				} else {
					throw new RuntimeException("id non trovato, la quantità del prodotto non è stata modificata");
				}
			}
		}
		return null;
	}
//---------------------------------------------------------------------------------\\
}
