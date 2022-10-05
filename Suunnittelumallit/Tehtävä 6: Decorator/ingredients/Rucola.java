package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class Rucola extends ToppingsDecorator{

	public Rucola(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Rucola added.");		
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + rucola";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 0.50;
	}
		
}