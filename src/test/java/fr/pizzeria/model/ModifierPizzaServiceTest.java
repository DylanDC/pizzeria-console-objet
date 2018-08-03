package fr.pizzeria.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.sql.SQLException;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class ModifierPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test
	public void testExecuteUC() throws SQLException {
		systemInMock.provideLines("PEP", "PIZ", "ThePizza", "170");
		PizzaBddDao test = new PizzaBddDao();
		ModifierPizzaService testModifServ = new ModifierPizzaService();
		testModifServ.executeUC(new Scanner(System.in), test);
		assertNotNull(test.findPizzaByCode("PIZ"));

	}

}
