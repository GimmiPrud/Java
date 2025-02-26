package com.spring.Rubrica.dto;

public class proprietario_anno_dto {
	
	private String nome_proprietario;
	private int anno_creazione;
	
	public proprietario_anno_dto(String nome_proprietario, int anno_creazione) {
		super();
		this.nome_proprietario = nome_proprietario;
		this.anno_creazione = anno_creazione;
	}
	
	public proprietario_anno_dto() {
		super();
	}

	public String getNome_proprietario() {
		return nome_proprietario;
	}
	public void setNome_proprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}
	public int getAnno_creazione() {
		return anno_creazione;
	}
	public void setAnno_creazione(int anno_creazione) {
		this.anno_creazione = anno_creazione;
	}
	
	
}
