package com.spring.Prodotti.DTO;

import java.util.List;
import java.util.Map;

public class Report_DTO {
	
	private List<String> descrizione_prodotti;
	private int quantità_totale;
	private int totale_non_disponibili;
	private Double media_prezzi;
	private List<String> prod_non_disponibili;
	private Map<String, List<Integer>> ID_prodotti;
	
	
	public Report_DTO(List<String> descrizione_prodotti, int quantità_totale, int totale_non_disponibili,
			Double media_prezzi, List<String> prod_non_disponibili, Map<String, List<Integer>> iD_prodotti) {
		super();
		this.descrizione_prodotti = descrizione_prodotti;
		this.quantità_totale = quantità_totale;
		this.totale_non_disponibili = totale_non_disponibili;
		this.media_prezzi = media_prezzi;
		this.prod_non_disponibili = prod_non_disponibili;
		ID_prodotti = iD_prodotti;
	}
	
	
	public Report_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<String> getDescrizione_prodotti() {
		return descrizione_prodotti;
	}
	public void setDescrizione_prodotti(List<String> descrizione_prodotti) {
		this.descrizione_prodotti = descrizione_prodotti;
	}
	public int getQuantità_totale() {
		return quantità_totale;
	}
	public void setQuantità_totale(int quantità_totale) {
		this.quantità_totale = quantità_totale;
	}
	public int getTotale_non_disponibili() {
		return totale_non_disponibili;
	}
	public void setTotale_non_disponibili(int totale_non_disponibili) {
		this.totale_non_disponibili = totale_non_disponibili;
	}
	public Double getMedia_prezzi() {
		return media_prezzi;
	}
	public void setMedia_prezzi(Double media_prezzi) {
		this.media_prezzi = media_prezzi;
	}
	public List<String> getProd_non_disponibili() {
		return prod_non_disponibili;
	}
	public void setProd_non_disponibili(List<String> prod_non_disponibili) {
		this.prod_non_disponibili = prod_non_disponibili;
	}
	public Map<String, List<Integer>> getID_prodotti() {
		return ID_prodotti;
	}
	public void setID_prodotti(Map<String, List<Integer>> iD_prodotti) {
		ID_prodotti = iD_prodotti;
	}

	@Override
	public String toString() {
		return "Report_DTO [descrizione_prodotti=" + descrizione_prodotti + ", quantità_totale=" + quantità_totale
				+ ", totale_non_disponibili=" + totale_non_disponibili + ", media_prezzi=" + media_prezzi
				+ ", prod_non_disponibili=" + prod_non_disponibili + ", ID_prodotti=" + ID_prodotti + "]";
	}
	
}
