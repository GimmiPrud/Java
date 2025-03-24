package com.spring.studentiHibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.studentiHibernate.Entity.Studenti;

public interface DaoStudente extends JpaRepository<Studenti, Integer> {
	

}
