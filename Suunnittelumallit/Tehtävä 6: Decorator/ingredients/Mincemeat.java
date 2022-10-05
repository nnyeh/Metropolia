package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class Mincemeat extends ToppingsDecorator{

	public Mincemeat(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Mincemeat added.");		
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + mincemeat";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 1.15;
	}
		
}