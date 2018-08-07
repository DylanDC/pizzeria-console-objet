package fr.pizzeria.model;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class PizzaJpaDao implements IPizzaDao {
	private EntityManagerFactory emf;
	private EntityManager connect;

	public void connect() {
		emf = Persistence.createEntityManagerFactory("pizzeria-console-objet");
		connect = emf.createEntityManager();

	}

	public void close() {
		emf.close();
		connect.close();

	}

	@Override
	public ArrayList<Pizza> findAllPizzas() throws SQLException {
		connect();
		TypedQuery<Pizza> query = connect.createQuery("SELECT p FROM Pizza p ", Pizza.class);
		ArrayList<Pizza> pizzas = (ArrayList<Pizza>) query.getResultList();
		close();
		return pizzas;
	}

	// Creation d'une nouvelle Pizza
	@Override
	public void saveNewPizza(Pizza pizza) throws SQLException {
		connect();
		EntityTransaction tx = this.connect.getTransaction();
		tx.begin();
		this.connect.persist(pizza);
		tx.commit();
		close();
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) throws SQLException {
		connect();
		EntityTransaction tx = this.connect.getTransaction();
		tx.begin();
		Query update = connect.createQuery(
				"UPDATE Pizza p SET p.code= :newCode, p.libelle= :newLibelle, p.prix= :newPrix WHERE p.code=:oldCode");
		String code = pizza.getCode();
		String nom = pizza.getLibelle();
		Double prix = pizza.getPrix();

		update.setParameter("newCode", code);
		update.setParameter("newLibelle", nom);
		update.setParameter("newPrix", prix);
		update.setParameter("oldCode", codePizza);

		update.executeUpdate();
		tx.commit();
		close();
	}

	@Override
	public void deletePizza(String codePizza) throws SQLException {
		connect();
		EntityTransaction tx = this.connect.getTransaction();
		tx.begin();
		Query query = connect.createQuery("DELETE FROM Pizza p WHERE p.code=:code");
		query.setParameter("code", codePizza);

		query.executeUpdate();
		tx.commit();
		close();
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
