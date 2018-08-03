package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IPizzaDao {

	ArrayList<Pizza> findAllPizzas() throws SQLException;

	void saveNewPizza(Pizza pizza) throws SQLException;

	void updatePizza(String codePizza, Pizza pizza) throws SQLException;

	void deletePizza(String codePizza) throws SQLException;

	Pizza findPizzaByCode(String codePizza);

	boolean pizzaExists(String codePizza);
}