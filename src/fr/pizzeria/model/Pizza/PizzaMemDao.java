package fr.pizzeria.model.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private Pizza[] pizzas;

	public PizzaMemDao() {
		// Tableau des pizzas
		pizzas = new Pizza[28];
		pizzas[0] = new Pizza(0, "PEP", "Pépéroni", 12.5);
		pizzas[1] = new Pizza(1, "MAR", "Margherita", 14);
		pizzas[2] = new Pizza(2, "REIN", "La Reine", 11.5);
		pizzas[3] = new Pizza(3, "FRO", "La 4 fromages", 12);
		pizzas[4] = new Pizza(4, "CAN", "La cannibale", 12.5);
		pizzas[5] = new Pizza(5, "SAV", "La savoyarde", 13);
		pizzas[6] = new Pizza(6, "ORI", "L'orientale", 13.5);
		pizzas[7] = new Pizza(7, "IND", "L'indienne", 14);
	}

	@Override
	public Pizza[] findAllPizzas() {

		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = pizza;
			}

		}

	}

	public void updatePizza(String codePizza, Pizza pizza) {

		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null && pizzas[i].getCode().equals(codePizza)) {
				pizzas[i] = pizza;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i].getCode().equals(codePizza)) {

				pizzas[i] = null;
				break;
			}

		}

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {

		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
