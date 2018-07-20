package fr.pizzeria.model.Pizza;

import java.util.Scanner;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		//listing des pizzas
		System.out.println("Liste des pizzas");

		Pizza[] pizzas = dao.findAllPizzas();
		for (int i = 0;i<pizzas.length;i++){
			if(pizzas[i]!=null){
				System.out.println(pizzas[i]);
			}
		}
		
		
		
	}

}
