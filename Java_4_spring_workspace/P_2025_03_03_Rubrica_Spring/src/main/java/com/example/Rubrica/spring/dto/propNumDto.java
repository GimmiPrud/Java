package com.example.Rubrica.spring.dto;

import java.util.List;

public class propNumDto {
	
	private List<String> lista_prorprietari_rubriche;
	private int num_tot_proprietari;
	
	
	public propNumDto(List<String> lista_prorprietari_rubriche, int num_tot_proprietari) {
		super();
		this.lista_prorprietari_rubriche = lista_prorprietari_rubriche;
		this.num_tot_proprietari = num_tot_proprietari;
	}
	
	public propNumDto() {
		super();
	}
	

	public List<String> getLista_prorprietari_rubriche() {
		return lista_prorprietari_rubriche;
	}

	public void setLista_prorprietari_rubriche(List<String> lista_prorprietari_rubriche) {
		this.lista_prorprietari_rubriche = lista_prorprietari_rubriche;
	}

	public int getNum_tot_proprietari() {
		return num_tot_proprietari;
	}

	public void setNum_tot_proprietari(int num_tot_proprietari) {
		this.num_tot_proprietari = num_tot_proprietari;
	}
	
	

}
