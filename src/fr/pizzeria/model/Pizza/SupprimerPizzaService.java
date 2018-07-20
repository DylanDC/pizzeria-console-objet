package fr.pizzeria.model.Pizza;

import java.util.Scanner;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		// TODO Auto-generated method stub
		
		System.out.println("Suppression d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		String fcode = scanner.next();
		dao.deletePizza(fcode);
	}

}
