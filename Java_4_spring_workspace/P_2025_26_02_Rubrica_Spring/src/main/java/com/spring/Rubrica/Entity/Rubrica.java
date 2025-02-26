package com.spring.Rubrica.Entity;

import java.util.List;

public class Rubrica {
	
	private int id;
	private String nome_proprietario;
	private int anno_creazione;
	private List<ContattoTelefonico> lista_contatti;
	
	
	public Rubrica( int id, String nome_proprietario, int anno_creazione) {
		super();
		this.nome_proprietario = nome_proprietario;
		this.anno_creazione = anno_creazione;
	}
	
	public Rubrica() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<ContattoTelefonico> getLista_contatti() {
		return lista_contatti;
	}
	public void setLista_contatti(List<ContattoTelefonico> lista_contatti) {
		this.lista_contatti = lista_contatti;
	}

	@Override
	public String toString() {
		return "Rubrica [id=" + id + ", nome_proprietario=" + nome_proprietario + ", anno_creazione=" + anno_creazione
				+ ", lista_contatti=" + lista_contatti + "]";
	}
	
}
