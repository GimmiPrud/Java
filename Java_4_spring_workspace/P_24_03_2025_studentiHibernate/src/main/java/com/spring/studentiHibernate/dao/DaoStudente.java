package com.spring.studentiHibernate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.studentiHibernate.Entity.Studenti;

public interface DaoStudente extends JpaRepository<Studenti, Integer> {
	
	// qui ci sono in eredità tutte le funzioni CRUD 
	
	// aggiunta di query native
	@Query(nativeQuery = true, value = "select * from studente where anno_immatricolazione > :anno_immatricolazione")
	public List<Studenti> getGiovani(Integer anno_immatricolazione);

}
