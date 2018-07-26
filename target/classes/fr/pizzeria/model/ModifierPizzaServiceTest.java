package fr.pizzeria.model;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class ModifierPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream  systemInMock = emptyStandardInputStream();
	
	@Test
	public void testExecuteUC() {
		systemInMock.provideLines("PEP","PIZ","ThePizza","170");
		PizzaMemDao test = new PizzaMemDao();
		ModifierPizzaService testModifServ= new ModifierPizzaService();
		testModifServ.executeUC(new Scanner(System.in), test);
		assertNotNull(test.findPizzaByCode("PIZ"));
		
	}

}
