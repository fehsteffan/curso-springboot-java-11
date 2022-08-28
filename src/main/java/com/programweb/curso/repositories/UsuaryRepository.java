package com.programweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programweb.curso.entities.Usuary;


public interface UsuaryRepository extends JpaRepository <Usuary, Long> {
	
	

}
