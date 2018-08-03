package fr.pizzeria.model;

import static org.junit.Assert.assertNull;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.sql.SQLException;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class SupprimerPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test
	public void testExecuteUC() throws SQLException {
		systemInMock.provideLines("PEP");
		PizzaBddDao test = new PizzaBddDao();
		SupprimerPizzaService testSupServ = new SupprimerPizzaService();
		testSupServ.executeUC(new Scanner(System.in), test);
		assertNull(test.findPizzaByCode("PEP"));

	}

}
