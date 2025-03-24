package com.spring.studentiHibernate.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Studenti {
	
	@Id
	private Integer matricola;  // primary key 
	private String nome;
	private String cognome;
	private Integer annoImmatricolazione;
	
		
	public Studenti(Integer matricola, String nome, String cognome, Integer annoImmatricolazione) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	
	public Studenti() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getMatricola() {
		return matricola;
	}
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Integer getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	public void setAnnoImmatricolazione(Integer annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	
}
