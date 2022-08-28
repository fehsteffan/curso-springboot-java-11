package com.programweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programweb.curso.entities.Usuary;
import com.programweb.curso.repositories.UsuaryRepository;

@Service
public class UsuaryService {
	
	@Autowired
	private UsuaryRepository repository;
	
	
	public List<Usuary> findAll(){
		return repository.findAll();
		
	}	
	
	public Usuary findById(Long id) {
		Optional<Usuary> obj = repository.findById(id);
		return obj.get();
	}

}
