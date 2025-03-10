package com.example.Rubrica.spring.dto;

public class ContNomeCognomeDto {
	
	private String nome;
	private String cognome;
	
	
	public ContNomeCognomeDto(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public ContNomeCognomeDto() {
		super();
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
	
	
}
