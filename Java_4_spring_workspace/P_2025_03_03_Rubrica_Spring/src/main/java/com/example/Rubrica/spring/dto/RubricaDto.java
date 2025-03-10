package com.example.Rubrica.spring.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.Rubrica.spring.Entity.ContattoTelefonico;

public class RubricaDto {
	
	private int id;
	private String nome_proprietario;
	private int anno_creazione;
	private Map<Integer, ContattoTelefonicoDto> lista_contatti = new HashMap<Integer, ContattoTelefonicoDto>();
	
	
	public RubricaDto( int id, String nome_proprietario, int anno_creazione) {
		super();
		this.id = id;
		this.nome_proprietario = nome_proprietario;
		this.anno_creazione = anno_creazione;
	}
	
	

	public RubricaDto(int id, String nome_proprietario, int anno_creazione,
			Map<Integer, ContattoTelefonicoDto> lista_contatti) {
		super();
		this.id = id;
		this.nome_proprietario = nome_proprietario;
		this.anno_creazione = anno_creazione;
		this.lista_contatti = lista_contatti;
	}



	public RubricaDto() {
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
	public Map<Integer,ContattoTelefonicoDto> getLista_contatti() {
		return lista_contatti;
	}
	public void setLista_contatti(Map<Integer, ContattoTelefonicoDto> lista_contatti) {
		this.lista_contatti = lista_contatti;
	}

	@Override
	public String toString() {
		return "Rubrica [id=" + id + ", nome_proprietario=" + nome_proprietario + ", anno_creazione=" + anno_creazione
				+ ", lista_contatti=" + lista_contatti + "]";
	}
	
}
