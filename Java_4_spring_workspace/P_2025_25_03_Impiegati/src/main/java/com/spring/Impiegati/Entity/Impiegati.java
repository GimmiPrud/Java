package com.spring.Impiegati.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Impiegati {
	
	@Id
	private Integer matricola;
	private String nome;
	private String cognome;
	private Double salarioMensile;
	
	
	public Impiegati(Integer matricola, String nome, String cognome, Double salarioMensile) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.salarioMensile = salarioMensile;
	}
	
	
	public Impiegati() {
		super();	
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
	public Double getSalarioMensile() {
		return salarioMensile;
	}
	public void setSalarioMensile(Double salarioMensile) {
		this.salarioMensile = salarioMensile;
	}
	
	
}
