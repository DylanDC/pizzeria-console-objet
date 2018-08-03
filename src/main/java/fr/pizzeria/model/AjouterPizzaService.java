package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.Scanner;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaBddDao dao) throws SQLException {
		// ajout d'une nouvelle pizza
		System.out.println("Ajout d’une nouvelle pizza");
		System.out.println("Veuillez saisir le code : ");
		String code = scanner.next();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String libelle = scanner.next();
		System.out.println("Veuillez saisir le prix :");
		double prix = scanner.nextDouble();

		dao.saveNewPizza(new Pizza(0, code, libelle, prix));

	}

}
