package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.Scanner;

public abstract class MenuService {

	public abstract void executeUC(Scanner scanner, PizzaJpaDao dao) throws SQLException;

}
