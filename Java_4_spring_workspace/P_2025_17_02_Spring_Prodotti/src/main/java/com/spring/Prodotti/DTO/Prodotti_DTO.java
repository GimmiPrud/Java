package com.spring.Prodotti.DTO;

public class Prodotti_DTO {

	private int ID; // key
	private String marca;
	private String modello;
	private String descrizione;
	private Double prezzo_consigliato;
	private Double prezzo_massimo;
	private Integer quantità;
	private String categoria;
	

	public Prodotti_DTO(int iD, String marca, String modello, String descrizione, Double prezzo_consigliato, Double prezzo_massimo, Integer quantità, String categoria) {
		super();
		ID = iD;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo_consigliato = prezzo_consigliato;
		this.prezzo_massimo = prezzo_massimo;
		this.quantità = quantità;
		this.categoria = categoria;
	}
	
	
	public Prodotti_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Double getPrezzo_consigliato() {
		return prezzo_consigliato;
	}
	public void setPrezzo_consigliato(Double prezzo_consigliato) {
		this.prezzo_consigliato = prezzo_consigliato;
	}
	public Double getPrezzo_massimo() {
		return prezzo_massimo;
	}
	public void setPrezzo_massimo(Double prezzo_massimo) {
		this.prezzo_massimo = prezzo_massimo;
	}
	public Integer getQuantità() {
		return quantità;
	}
	public void setQuantità(Integer quantità) {
		this.quantità = quantità;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Prodotti [ID=" + ID + ", marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione
				+ ", prezzo_consigliato=" + prezzo_consigliato + ", prezzo_massimo=" + prezzo_massimo + ", quantità="
				+ quantità + ", categoria=" + categoria + ", getID()=" + getID() + ", getMarca()=" + getMarca()
				+ ", getModello()=" + getModello() + ", getDescrizione()=" + getDescrizione()
				+ ", getPrezzo_consigliato()=" + getPrezzo_consigliato() + ", getPrezzo_massimo()="
				+ getPrezzo_massimo() + ", getQuantità()=" + getQuantità() + ", getCategoria()=" + getCategoria() + "]";
	}
	
	
}
