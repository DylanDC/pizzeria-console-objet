package fr.pizzeria.model.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		//listing des pizzas
		System.out.println("Liste des pizzas");

		ArrayList<Pizza> pizzas = dao.findAllPizzas();
		
			
				System.out.println(pizzas);
			
		
		
		
		
	}

}
