package decorator;

public abstract class ToppingsDecorator implements Pizza {

	protected Pizza pizzaOrder;
	
	public ToppingsDecorator(Pizza newPizza) {		
		pizzaOrder = newPizza;
	}
	
	public double getCost() {
		return pizzaOrder.getCost();
	}
	
	public String getDescription() {
		return pizzaOrder.getDescription();
	}
	
}