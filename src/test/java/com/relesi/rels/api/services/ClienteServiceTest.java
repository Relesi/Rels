package com.relesi.rels.api.services;

import java.util.List;

import org.assertj.core.api.ListAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.relesi.rels.api.documents.Cliente;
import com.relesi.rels.api.services.impl.ClienteServiceImpl;

//@RunWith(MockitoJUnitRunner.class)
public class ClienteServiceTest {

	@InjectMocks
	private ClienteService clienteService;
	
	@InjectMocks
	private ClienteServiceImpl clienteServiceImpl;
	
	@Mock
	private Cliente cliente;
	
	@Test
	public void testarList() {
		
		
		
	}
}
