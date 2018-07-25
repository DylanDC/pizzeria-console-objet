package fr.pizzeria.console;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza.AjouterPizzaService;
import fr.pizzeria.model.Pizza.ListerPizzasService;
import fr.pizzeria.model.Pizza.ModifierPizzaService;
import fr.pizzeria.model.Pizza.PizzaMemDao;
import fr.pizzeria.model.Pizza.SupprimerPizzaService;

public class PizeriaAdminConsoleApp {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		PizzaMemDao dao = new PizzaMemDao();

		

		


		int choix = 0;
		do{
			//MENU Principale
			System.out.println( "***** Pizzeria Administration*****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une pizza");
			System.out.println("3.Mettre � jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choix = scanner.nextInt();

			switch (choix){
			case 1:
				ListerPizzasService listpizza = new ListerPizzasService();
				listpizza.executeUC(scanner, dao);
				
				//listing des pizzas
//				System.out.println("Liste des pizzas");
//
//				Pizza[] pizzas = dao.findAllPizzas();
//				for (int i = 0;i<pizzas.length;i++){
//					if(pizzas[i]!=null){
//						System.out.println(pizzas[i]);
//					}
//				}
				
				
				break;
			case 2:
				AjouterPizzaService ajService = new AjouterPizzaService();
				ajService.executeUC(scanner, dao);
				//ajout d'une nouvelle pizza
//				System.out.println("Ajout d�une nouvelle pizza");
//				System.out.println("Veuillez saisir le code : ");
//				String code = scanner.next();
//				System.out.println("Veuillez saisir le nom (sans espace) :");
//				String libelle = scanner.next();
//				System.out.println("Veuillez saisir le prix :");
//				double prix = scanner.nextDouble();
//
//				dao.saveNewPizza(new Pizza (0,code,libelle,prix));

				break;

			case 3:
				ModifierPizzaService modifPizza= new ModifierPizzaService();
				modifPizza.executeUC(scanner, dao);
//				System.out.println("Mise � jour d�une pizza");
//				pizzas = dao.findAllPizzas();
//				for (int i = 0;i<pizzas.length;i++){
//					if (pizzas[i]!=null){
//						System.out.println(pizzas[i]);	
//					}
//				}
//
//				System.out.println("Veuillez choisir le code de la pizza � modifier ! ");
//				String pcode = scanner.next();
//				
//				System.out.println("Veuillez saisir le nouveau Code");
//				String newcode = scanner.next();
//				System.out.println("Veuillez saisir le nouveau nom (sans espace)");
//				String newlibelle = scanner.next();
//				System.out.println("Veuillez saisir le nouveau prix ");
//				double newprix = scanner.nextDouble();
//				
//				dao.updatePizza(pcode, new Pizza(0,newcode,newlibelle,newprix));
				
				break;
			case 4: 
				
				SupprimerPizzaService supPizza = new SupprimerPizzaService();
				supPizza.executeUC(scanner, dao);
//								System.out.println("Suppression d�une pizza");
//								System.out.println("Veuillez choisir le code de la pizza � supprimer :");
//								String fcode = scanner.next();
//								dao.deletePizza(fcode);
				//				for(int i = 0; i<pizzas.length;i++) {
				//					if(pizzas[i].getCode().equals(fcode)) {
				//
				//
				//						pizzas[i] = null;
				//						break;
				//					}
				//
				//
				//				}
				break;
				
			case 99:
				System.out.println("Aurevoir");
				break;
			}

		}while( choix != 99  );	









	}
}


