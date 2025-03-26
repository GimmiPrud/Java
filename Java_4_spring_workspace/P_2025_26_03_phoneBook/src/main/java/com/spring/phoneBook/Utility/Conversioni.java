package com.spring.phoneBook.Utility;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.phoneBook.Dto.ContattoDto;
import com.spring.phoneBook.Dto.RubricaDto;
import com.spring.phoneBook.Entity.Contatto;
import com.spring.phoneBook.Entity.Rubrica;

public class Conversioni {
	
	public static Contatto daContattoDtoAContatto(ContattoDto dto) {
        return new Contatto(dto.getIdContatto(), dto.getNome(), dto.getCognome(), dto.getNumero());
    }

    public static ContattoDto daContattoAContattoDto(Contatto contatto) {
        return new ContattoDto(contatto.getIdContatto(), contatto.getNome(), contatto.getCognome(), contatto.getNumero());
    }

    public static Rubrica daRubricaDtoARubrica(RubricaDto dto) {
        Rubrica rubrica = new Rubrica(dto.getIdRubrica(), dto.getProprietario(), dto.getAnnoCreazione());

        // converto la lista
        List<ContattoDto> listaD = dto.getContatti();

        List<Contatto> lista = listaD.stream()
                .map(contattoD -> Conversioni.daContattoDtoAContatto(contattoD))
                .collect(Collectors.toList());

        rubrica.setContatti(lista);
        return rubrica;

    }

    public static RubricaDto daRubricaARubricaDto(Rubrica rubrica) {
        RubricaDto rubricaD = new RubricaDto(rubrica.getIdRubrica(), rubrica.getProprietario(), rubrica.getAnnoCreazione());

        // converto la lista
        List<Contatto> lista = rubrica.getContatti();

        List<ContattoDto> listaD = lista.stream()
                .map(contatto -> Conversioni.daContattoAContattoDto(contatto))
                .collect(Collectors.toList());

        rubricaD.setContatti(listaD);
        return rubricaD;
    }
}
