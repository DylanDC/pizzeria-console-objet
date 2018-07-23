package fr.pizzeria.console;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza.AjouterPizzaService;
import fr.pizzeria.model.Pizza.PizzaMemDao;

public class PizeriaAdminConsoleApp {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		PizzaMemDao dao = new PizzaMemDao();

		

		//List pizza "ArrayList"
		//		ArrayList <Pizza> pizzas = new ArrayList<Pizza>();
		//		//List ajout de mes valeurs liste = new ArrayList();
		//		pizzas.add(new Pizza(0,"PEP","Pépéroni",12.5));
		//		pizzas.add(new Pizza(1,"MAR","Margherita",14));
		//		pizzas.add(new Pizza(2,"REIN","La Reine",11.5));
		//		pizzas.add(new Pizza(3,"FRO","La 4 fromages",12));
		//		pizzas.add(new Pizza(4,"CAN","La cannibale",12.5));
		//		pizzas.add(new Pizza(5,"SAV","La savoyarde",13));
		//		pizzas.add(new Pizza(6,"ORI","L'orientale",13.5));
		//		pizzas.add(new Pizza(7,"IND","L'indienne",14));


		int choix = 0;
		do{
			//MENU Principale
			System.out.println( "***** Pizzeria Administration*****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une pizza");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choix = scanner.nextInt();

			switch (choix){
			case 1:
				
				
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
//				System.out.println("Ajout d’une nouvelle pizza");
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
				
//				System.out.println("Mise à jour d’une pizza");
//				pizzas = dao.findAllPizzas();
//				for (int i = 0;i<pizzas.length;i++){
//					if (pizzas[i]!=null){
//						System.out.println(pizzas[i]);	
//					}
//				}
//
//				System.out.println("Veuillez choisir le code de la pizza à modifier ! ");
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
				
//								System.out.println("Suppression d’une pizza");
//								System.out.println("Veuillez choisir le code de la pizza à supprimer :");
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


