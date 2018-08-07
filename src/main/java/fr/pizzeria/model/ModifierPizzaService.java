package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws SQLException {
		System.out.println("Mise à jour d’une pizza");
		ArrayList<Pizza> pizzas = dao.findAllPizzas();
		for (int i = 0; i < pizzas.size(); i++) {

			System.out.println(pizzas.get(i));

		}

		System.out.println("Veuillez choisir le code de la pizza à modifier ! ");
		String pcode = scanner.next();

		System.out.println("Veuillez saisir le nouveau Code");
		String newcode = scanner.next();
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String newlibelle = scanner.next();
		System.out.println("Veuillez saisir le nouveau prix ");
		double newprix = scanner.nextDouble();

		dao.updatePizza(pcode, new Pizza(0, newcode, newlibelle, newprix));

	}

}
