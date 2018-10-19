package com.relesi.rels.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.relesi.rels.api.services.ClienteService;
import com.relesi.rels.api.services.impl.ClienteServiceImpl;

@RunWith(SpringRunner.class)
public class RelsApplicationTests {
	
	@InjectMocks
	private RelsApplication relsApplication;
	
	@Mock
	private ClienteService clienteService;
	
	
	

	@Test
	public void appRelsApplicationTest() {
		
		Mockito.doNothing().when(clienteService).run();
		
		try {
			this.relsApplication.run();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
