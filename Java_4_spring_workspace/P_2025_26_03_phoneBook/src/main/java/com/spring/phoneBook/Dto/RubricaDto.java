package com.spring.phoneBook.Dto;

import java.util.ArrayList;
import java.util.List;


public class RubricaDto {
	
private int idRubrica;
	
	private String proprietario;
	private int annoCreazione;
	

	private List<ContattoDto> contatti = new ArrayList<ContattoDto>();

	public RubricaDto() {
		super();
	}

	public RubricaDto(int idRubrica, String proprietario, int annoCreazione) {
		super();
		this.idRubrica = idRubrica;
		this.proprietario = proprietario;
		this.annoCreazione = annoCreazione;
	}

	
	public int getIdRubrica() {
		return idRubrica;
	}

	public void setIdRubrica(int idRubrica) {
		this.idRubrica = idRubrica;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(int annoCreazione) {
		this.annoCreazione = annoCreazione;
	}

	public List<ContattoDto> getContatti() {
		return contatti;
	}

	public void setContatti(List<ContattoDto> contatti) {
		this.contatti = contatti;
	}
	
	// aggiungo un metodo di business
	public void addContatto(ContattoDto contatto) {
		contatti.add(contatto);
	}
}
