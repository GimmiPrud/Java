package com.spring.Ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prodotto {
	
	@Id
	private Integer id;
	
	private String descrizione;
	private Integer quantita;
	private Double prezzo;
	private Integer sconto;
	private String categoria;
	

	public Prodotto(Integer id, String descrizione, Integer quantita, Double prezzo, Integer sconto, String categoria) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.sconto = sconto;
		this.categoria = categoria;
	}
	
	
	public Prodotto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Integer getSconto() {
		return sconto;
	}
	public void setSconto(Integer sconto) {
		this.sconto = sconto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

	
}
