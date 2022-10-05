package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class Cheese extends ToppingsDecorator {

	public Cheese(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Cheese added.");		
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + cheese";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 0.40;
	}

}