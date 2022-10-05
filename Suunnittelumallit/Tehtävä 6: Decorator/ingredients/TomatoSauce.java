package ingredients;

import decorator.Pizza;
import decorator.ToppingsDecorator;

public class TomatoSauce extends ToppingsDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);		
		System.out.println("Dough added.");		
		System.out.println("Sauce added.");
	}

	public String getDescription() {
		return pizzaOrder.getDescription() + " + tomato sauce";
	}
	
	public double getCost() {
		return pizzaOrder.getCost() + 0.45;
	}	
	
}