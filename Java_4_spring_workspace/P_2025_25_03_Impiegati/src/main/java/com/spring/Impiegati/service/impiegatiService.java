package com.spring.Impiegati.service;

import java.util.List;

import com.spring.Impiegati.Dto.NomeCognomeDto;
import com.spring.Impiegati.Dto.impiegatiDto;
import com.spring.Impiegati.Entity.Impiegati;

public interface impiegatiService {
	
	
	public boolean assumi(impiegatiDto impiegato);
	public impiegatiDto cerca(Integer matricola);
	public List<impiegatiDto> visualizzaTutti();
	public impiegatiDto licenzia(Integer matricola);
	public impiegatiDto modSalario(Integer matricola, Double salario);
	
	// Avanzati
	public NomeCognomeDto cancella(Integer matricola);
	public List<NomeCognomeDto> listaNominativi();
	public List<impiegatiDto> getSalario(Double salario);
	public List<impiegatiDto> orderCognome();
	public List<impiegatiDto> orderSalario();
	
}
