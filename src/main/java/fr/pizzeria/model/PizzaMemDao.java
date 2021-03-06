package fr.pizzeria.model;

import java.util.ArrayList;

public class PizzaMemDao implements IPizzaDao {

	private ArrayList<Pizza> pizzas;

	public PizzaMemDao() {
		/*
		 * // Tableau des pizzas pizzas = new Pizza[28]; pizzas[0] = new
		 * Pizza(0, "PEP", "P�p�roni", 12.5); pizzas[1] = new Pizza(1, "MAR",
		 * "Margherita", 14); pizzas[2] = new Pizza(2, "REIN", "La Reine",
		 * 11.5); pizzas[3] = new Pizza(3, "FRO", "La 4 fromages", 12);
		 * pizzas[4] = new Pizza(4, "CAN", "La cannibale", 12.5); pizzas[5] =
		 * new Pizza(5, "SAV", "La savoyarde", 13); pizzas[6] = new Pizza(6,
		 * "ORI", "L'orientale", 13.5); pizzas[7] = new Pizza(7, "IND",
		 * "L'indienne", 14);
		 */
		// List pizza "ArrayList"
		pizzas = new ArrayList<Pizza>();
		// List ajout de mes valeurs liste = new ArrayList();
		pizzas.add(new Pizza(0, "PEP", "P�p�roni", 12.5));
		pizzas.add(new Pizza(1, "MAR", "Margherita", 14));
		pizzas.add(new Pizza(2, "REIN", "La Reine", 11.5));
		pizzas.add(new Pizza(3, "FRO", "La 4 fromages", 12));
		pizzas.add(new Pizza(4, "CAN", "La cannibale", 12.5));
		pizzas.add(new Pizza(5, "SAV", "La savoyarde", 13));
		pizzas.add(new Pizza(6, "ORI", "L'orientale", 13.5));
		pizzas.add(new Pizza(7, "IND", "L'indienne", 14));
	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {

		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzas.add(pizza);

	}

	public void updatePizza(String codePizza, Pizza pizza) {

		for (int i = 0; i < pizzas.size(); i++) {
			if (pizzas.get(i).getCode().equals(codePizza)) {
				Pizza pizzaModif = pizzas.get(i);
				pizzaModif.setCode(pizza.getCode());
				pizzaModif.setLibelle(pizza.getLibelle());
				pizzaModif.setPrix(pizza.getPrix());
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			if (pizzas.get(i).getCode().equals(codePizza)) {
				pizzas.remove(i);
				// supprimer variable unique "ici la variable code"
				// pizzas.get(i).setCode(null);

			}

		}

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			if (pizzas.get(i).getCode().equals(codePizza)) {
				return pizzas.get(i);

			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		if (findPizzaByCode(codePizza).getCode().equals(codePizza)) {

			return true;
		}

		return false;
	}
}
