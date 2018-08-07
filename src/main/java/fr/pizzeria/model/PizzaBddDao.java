package fr.pizzeria.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PizzaBddDao implements IPizzaDao {
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	public Connection ConnexionBdd() throws SQLException {
		Connection connexion = null;

		String jdcUrl = "jdbc:mysql://localhost:3306/bdd_mysql";

		// Nom utilisateur d'accès à la bdd
		String nomUtilisateur = "root";
		//
		// // Mot de passe d'accès à la bdd
		String motDePasse = "";

		connexion = DriverManager.getConnection(jdcUrl, nomUtilisateur, motDePasse);

		return connexion;
	}

	@Override
	public ArrayList<Pizza> findAllPizzas() throws SQLException {
		Connection connexion = ConnexionBdd();
		Statement statement = connexion.createStatement();
		ArrayList<Pizza> pizzas1 = new ArrayList<Pizza>();
		// Récupération du curseur de résultat de l'exécution de la
		// requête SQL
		ResultSet resultSet = statement.executeQuery("SELECT * FROM pizza");
		while (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String code = resultSet.getString("CODE");
			String nom = resultSet.getString("LIBELLE");
			Double prix = resultSet.getDouble("PRIX");

			Pizza pizza = new Pizza(id, nom, code, prix);
			pizzas1.add(pizza);
		}
		pizzas = pizzas1;

		if (pizzas.isEmpty()) {
			System.out.println("c'est vide");
		}
		resultSet.close();
		statement.close();
		connexion.close();
		return pizzas;

	}

	@Override
	public void saveNewPizza(Pizza pizza) throws SQLException {
		Connection connexion = ConnexionBdd();
		PreparedStatement statement = connexion
				.prepareStatement("INSERT INTO pizza(CODE, LIBELLE, PRIX ) VALUES (?, ?, ?)");

		String code = pizza.getCode();
		String nom = pizza.getLibelle();
		Double prix = pizza.getPrix();

		statement.setString(1, code);
		statement.setString(2, nom);
		statement.setDouble(3, prix);

		ResultSet resultSet = statement.executeQuery();
		resultSet.close();
		statement.close();
		connexion.close();
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) throws SQLException {
		Connection connexion = ConnexionBdd();
		PreparedStatement statement = connexion
				.prepareStatement("UPDATE pizza SET CODE=?, LIBELLE=?, PRIX=? WHERE CODE =?");

		String code = pizza.getCode();
		String nom = pizza.getLibelle();
		Double prix = pizza.getPrix();

		statement.setString(1, code);
		statement.setString(2, nom);
		statement.setDouble(3, prix);
		statement.setString(4, codePizza);

		ResultSet resultSet = statement.executeQuery();
		resultSet.close();
		statement.close();
		connexion.close();
	}

	@Override
	public void deletePizza(String codePizza) throws SQLException {
		Connection connexion = ConnexionBdd();
		PreparedStatement statement = connexion.prepareStatement("DELETE FROM pizza WHERE CODE =?");
		statement.setString(1, codePizza);
		ResultSet resultSet = statement.executeQuery();
		resultSet.close();
		statement.close();
		connexion.close();
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}