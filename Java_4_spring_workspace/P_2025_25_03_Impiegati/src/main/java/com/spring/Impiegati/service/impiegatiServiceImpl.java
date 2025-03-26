package com.spring.Impiegati.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Impiegati.Dao.impiegatiDao;
import com.spring.Impiegati.Dto.NomeCognomeDto;
import com.spring.Impiegati.Dto.impiegatiDto;
import com.spring.Impiegati.Entity.Impiegati;
import com.spring.Impiegati.utility.Conversioni;

@Service
@Transactional
public class impiegatiServiceImpl implements impiegatiService {
	
	@Autowired
	private impiegatiDao dao;
	

	@Override
	public boolean assumi(impiegatiDto dto) {
		Impiegati imp = new Impiegati(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getSalarioMensile());
		Optional<Impiegati> opt = dao.findById(dto.getMatricola());
		if (opt.isEmpty()) {
			dao.save(imp);
			return true;
		} else {
			return false;
		}
	}
//------------------------------------------------------------\\
	
	@Override
	public impiegatiDto cerca(Integer matricola) {
		Optional<Impiegati> imp = dao.findById(matricola);
		if (imp.isPresent()) {
			Impiegati i = imp.get();
			return new impiegatiDto(i.getMatricola(), i.getNome(), i.getCognome(), i.getSalarioMensile());
		}
		return null;
	}
	
//----------------------------------------------------------\\

	@Override
	public List<impiegatiDto> visualizzaTutti() {
		
		List<Impiegati> listImp = dao.findAll();
		
		return listImp.stream()
				.map(imp -> new impiegatiDto(imp.getMatricola(), imp.getNome(), imp.getCognome(), imp.getSalarioMensile()))
				.collect(Collectors.toList());
	}
//-----------------------------------------------------------\\
	
	@Override
	public impiegatiDto licenzia(Integer matricola) {
		Optional<Impiegati> imp = dao.findById(matricola);
		if (imp.isPresent()) {
			dao.deleteById(matricola);
			return Conversioni.daImpiegatoAImpiegatoDto(imp.get());
		} else {
			throw new RuntimeException("matricola non trovata");
		}
	}
//-----------------------------------------------------------\\

	@Override
	public impiegatiDto modSalario(Integer matricola, Double salario) {
		Optional<Impiegati> imp = dao.findById(matricola);
		if(imp.isPresent()) {
			Impiegati i = imp.get();
			i.setSalarioMensile(salario);
			return Conversioni.daImpiegatoAImpiegatoDto(i);
		} else {
			throw new RuntimeException("matricola non trovata");
		}
	}
//------------------------------------------------------------\\

	@Override
	public NomeCognomeDto cancella(Integer matricola) {
		Optional<Impiegati> imp = dao.findById(matricola);
		if (imp.isPresent()) {
			dao.deleteById(matricola);
			Impiegati i = imp.get();
			Conversioni.daImpiegatoAImpiegatoDto(i);
			NomeCognomeDto ii = new NomeCognomeDto(i.getNome(), i.getCognome());
			return ii;
		} else {
			throw new RuntimeException("matricola non trovata");
		}
	}
//-----------------------------------------------------------------\\
	
	@Override
	public List<NomeCognomeDto> listaNominativi() {
		List<Impiegati> im = dao.findAll();
		List<NomeCognomeDto> nm = new ArrayList<NomeCognomeDto>();
		for(Impiegati i : im) {
			nm.add(new NomeCognomeDto(i.getNome(),i.getCognome()));
		}
		return nm;
	}
//------------------------------------------------------------------\\

	@Override
	public List<impiegatiDto> getSalario(Double salario) {
		List<Impiegati> lIm = dao.getSalario(salario);
		List<impiegatiDto> ldto = new ArrayList<impiegatiDto>();
		for (Impiegati i : lIm) {
			if(i.getSalarioMensile() > salario) {
			ldto.add(Conversioni.daImpiegatoAImpiegatoDto(i));
			}
		}
		return ldto;
	}
//-----------------------------------------------------------------\\

	@Override
	public List<impiegatiDto> orderCognome() {
		List<Impiegati> l = dao.orderCognome();
		List<impiegatiDto> ldto = new ArrayList<impiegatiDto>();
		for (Impiegati i : l) {
			ldto.add(Conversioni.daImpiegatoAImpiegatoDto(i));
		}
		return ldto;
	}
//-------------------------------------------------------------------\\

	@Override
	public List<impiegatiDto> orderSalario() {
		List<Impiegati> l = dao.orderSalario();
		List<impiegatiDto> ldto = new ArrayList<impiegatiDto>();
		for (Impiegati i : l) {
			ldto.add(Conversioni.daImpiegatoAImpiegatoDto(i));
		}
		return ldto;
	}
	
	
	
	
}
