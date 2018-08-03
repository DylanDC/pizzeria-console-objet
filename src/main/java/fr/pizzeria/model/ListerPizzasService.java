package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaBddDao dao) throws SQLException {
		// listing des pizzas
		try {
			System.out.println("Liste des pizzas");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<Pizza> pizzas = dao.findAllPizzas();

		System.out.println(pizzas);

	}

}
