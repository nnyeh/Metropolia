package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class Salmon extends ToppingsDecorator{

	public Salmon(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Salmon added.");		
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + salmon";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 1.75;
	}
	
}