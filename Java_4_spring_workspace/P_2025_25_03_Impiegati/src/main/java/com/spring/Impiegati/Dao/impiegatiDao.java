package com.spring.Impiegati.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.Impiegati.Entity.Impiegati;

public interface impiegatiDao extends JpaRepository<Impiegati, Integer> {
	
	//Query
	@Query(nativeQuery = true, value = "select * from impiegati where salario_mensile > :salario")
	public List<Impiegati> getSalario(Double salario);
	
	@Query(nativeQuery = true, value = "select * from impiegati order by cognome")
	public List<Impiegati> orderCognome();
	
	@Query(nativeQuery = true, value = "select * from impiegati order by salario_mensile")
	public List<Impiegati> orderSalario();

}
