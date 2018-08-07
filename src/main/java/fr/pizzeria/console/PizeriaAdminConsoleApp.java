package fr.pizzeria.console;

import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.IPizzaDao;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.PizzaJpaDao;
import fr.pizzeria.model.SupprimerPizzaService;

public class PizeriaAdminConsoleApp {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		IPizzaDao dao = new PizzaJpaDao();

		int choix = 0;
		do {
			// MENU Principale
			System.out.println("***** Pizzeria Administration*****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une pizza");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choix = scanner.nextInt();

			switch (choix) {
			case 1:
				ListerPizzasService listpizza = new ListerPizzasService();
				listpizza.executeUC(scanner, dao);

				break;
			case 2:
				AjouterPizzaService ajService = new AjouterPizzaService();
				ajService.executeUC(scanner, dao);

				break;

			case 3:
				ModifierPizzaService modifPizza = new ModifierPizzaService();
				modifPizza.executeUC(scanner, dao);

				break;
			case 4:

				SupprimerPizzaService supPizza = new SupprimerPizzaService();
				supPizza.executeUC(scanner, dao);

				break;

			case 99:
				System.out.println("Aurevoir");
				break;
			}

		} while (choix != 99);

	}
}
