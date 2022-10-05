package decorator;

import ingredients.Salmon;
import ingredients.Rucola;
import ingredients.Caviar;
import ingredients.Cheese;
import ingredients.Mincemeat;
import ingredients.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza margarita = new TomatoSauce(new Cheese(new PizzaNoToppings()));
		
		System.out.println("\nIngredients: " + margarita.getDescription());
		System.out.println("Total: " + margarita.getCost() + "\n\n");		
		
		Pizza bolognese = new TomatoSauce(new Mincemeat(new Cheese(new PizzaNoToppings())));
		
		System.out.println("\nIngredients: " + bolognese.getDescription());
		System.out.println("Total: " + bolognese.getCost() + "\n\n");		
		
		Pizza salmonrucola = new TomatoSauce(new Rucola(new Salmon(new Caviar(new PizzaNoToppings()))));
		
		System.out.println("\nIngredients: " + salmonrucola.getDescription());
		System.out.println("Total: " + salmonrucola.getCost() + "\n\n");
	}

}