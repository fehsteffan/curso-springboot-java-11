package com.programweb.curso.config;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.programweb.curso.entities.Usuary;
import com.programweb.curso.repositories.UsuaryRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuaryRepository usuaryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuary u1 = new Usuary(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Usuary u2 = new Usuary(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		usuaryRepository.saveAll(Arrays.asList(u1, u2));		

		
	}

}
