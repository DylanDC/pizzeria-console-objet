package fr.pizzeria.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;




public class PizzaMemDaoTest {

	

	@Test
	public void testFindAllPizzas() {
		PizzaMemDao testFindAll = new PizzaMemDao();
		assertEquals(8, testFindAll.findAllPizzas().size());
	}

	@Test
	public void testSaveNewPizza() {
		PizzaMemDao testSave = new PizzaMemDao();
		assertEquals(8, testSave.findAllPizzas().size());
		Pizza pizza = new Pizza(0, "ABC", "test", 12);
		testSave.saveNewPizza(pizza);
		assertEquals(9, testSave.findAllPizzas().size());
			
		
	}

	@Test
	public void testUpdatePizza() {
		
		PizzaMemDao testupdate = new PizzaMemDao();
		assertEquals(8, testupdate.findAllPizzas().size());
		Pizza pizza = new Pizza(0,"new", "news",10);
		testupdate.updatePizza("123", pizza);
		assertEquals(8, testupdate.findAllPizzas().size());
		
		
	}

	@Test
	public void testDeletePizza() {
		PizzaMemDao testDelete = new PizzaMemDao();
		assertEquals(8, testDelete.findAllPizzas().size());
		testDelete.deletePizza("PEP");
		assertEquals(7, testDelete.findAllPizzas().size());
	}

	@Test
	public void testFindPizzaByCode() {
		PizzaMemDao dao = new PizzaMemDao();
		Pizza p = dao.findPizzaByCode("PEP");
		assertEquals("PEP", p.getCode());
		
		p = dao.findPizzaByCode("Pokpok");
		assertNull(p);
	}

	

}
