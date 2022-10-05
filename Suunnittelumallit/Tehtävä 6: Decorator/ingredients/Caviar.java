package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class Caviar extends ToppingsDecorator {

	public Caviar(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Caviar added.");		
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + caviar";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 1.25;
	}

}
