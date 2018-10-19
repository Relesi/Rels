package com.relesi.rels.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.relesi.rels.api.services.ClienteService;
import com.relesi.rels.api.services.impl.ClienteServiceImpl;

@SpringBootApplication
public class RelsApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(RelsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clienteService.run();
		
	}
}
