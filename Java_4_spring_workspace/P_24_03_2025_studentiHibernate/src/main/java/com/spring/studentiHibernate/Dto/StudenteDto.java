package com.spring.studentiHibernate.Dto;

public class StudenteDto {
	
	private Integer matricola;  // primary key 
	private String nome;
	private String cognome;
	private Integer anno_immatricolazione;
	

	public StudenteDto(Integer matricola, String nome, String cognome, Integer anno_immatricolazione) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.anno_immatricolazione = anno_immatricolazione;
	}
	
	
	public StudenteDto() {
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
	public Integer getAnno_immatricolazione() {
		return anno_immatricolazione;
	}
	public void setAnno_immatricolazione(Integer anno_immatricolazione) {
		this.anno_immatricolazione = anno_immatricolazione;
	}
	
	
}
