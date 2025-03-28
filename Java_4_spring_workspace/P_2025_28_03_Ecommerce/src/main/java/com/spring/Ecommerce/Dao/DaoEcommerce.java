package com.spring.Ecommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Ecommerce.Entity.Venditore;

public interface DaoEcommerce extends JpaRepository<Venditore, Integer> {
	
}
