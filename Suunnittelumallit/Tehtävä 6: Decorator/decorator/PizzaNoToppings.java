package decorator;

public class PizzaNoToppings implements Pizza {

	@Override
	public String getDescription() {
		return "dough";
	}

	@Override
	public double getCost() {
		return 5.50;
	}

}