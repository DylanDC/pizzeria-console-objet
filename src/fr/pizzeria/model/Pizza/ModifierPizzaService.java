package fr.pizzeria.model.Pizza;

import java.util.Scanner;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		System.out.println("Mise � jour d�une pizza");
		Pizza[] pizzas = dao.findAllPizzas();
		for (int i = 0;i<pizzas.length;i++){
			if (pizzas[i]!=null){
				System.out.println(pizzas[i]);	
			}
		}

		System.out.println("Veuillez choisir le code de la pizza � modifier ! ");
		String pcode = scanner.next();
		
		System.out.println("Veuillez saisir le nouveau Code");
		String newcode = scanner.next();
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String newlibelle = scanner.next();
		System.out.println("Veuillez saisir le nouveau prix ");
		double newprix = scanner.nextDouble();
		
		dao.updatePizza(pcode, new Pizza(0,newcode,newlibelle,newprix));
		
	}

}
