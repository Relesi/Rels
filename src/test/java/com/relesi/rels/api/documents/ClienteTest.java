package com.relesi.rels.api.documents;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void testarId() {
		Cliente cli = new Cliente();
		cli.setId(null);
		assertEquals(null,  cli.getId());	
	}

	@Test
	public void testarNome() {		
		Cliente cli = new Cliente();
		cli.setNome("Renato");
		assertEquals("Renato",  cli.getNome());	
	}
	
	@Test
	public void testarEmail() {
		Cliente cli = new Cliente();
		cli.setEmail("renatolessa.2011@hotmail.com");
		assertEquals("renatolessa.2011@hotmail.com",  cli.getEmail());	
	}
	
	@Test
	public void testarCpf() {
		Cliente cli = new Cliente();
		cli.setCpf(null);
		assertEquals(null,  cli.getCpf());	

	}
	
}
