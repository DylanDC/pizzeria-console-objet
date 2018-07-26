package fr.pizzeria.model;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class SupprimerPizzaServiceTest {
	
	@Rule
	public TextFromStandardInputStream  systemInMock = emptyStandardInputStream();
	
	@Test
	public void testExecuteUC() {
		systemInMock.provideLines("PEP");
		PizzaMemDao test = new PizzaMemDao();
		SupprimerPizzaService testSupServ= new SupprimerPizzaService();
		testSupServ.executeUC(new Scanner(System.in), test);
		assertNull(test.findPizzaByCode("PEP"));
		
	}
		 
	}


