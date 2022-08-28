package com.programweb.curso.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.programweb.curso.entities.Usuary;
@RestController
@RequestMapping(value = "/users")
public class UsuaryResource {
	
	@GetMapping
	public ResponseEntity<Usuary> findAll() {
		Usuary u = new Usuary(1L, "Maria ", " maria@gmail.com", " 88888", "12345");
		return ResponseEntity.ok().body(u);
	}
	
	

}
