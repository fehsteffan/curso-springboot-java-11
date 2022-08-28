package com.programweb.curso.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programweb.curso.entities.Usuary;
import com.programweb.curso.services.UsuaryService;

@RestController
@RequestMapping(value = "/users")
public class UsuaryResource {
	
	@Autowired
	private UsuaryService service;
	
	@GetMapping
	public ResponseEntity<List<Usuary>> findAll() {
		List<Usuary> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuary> findById(@PathVariable Long id){
		Usuary obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
