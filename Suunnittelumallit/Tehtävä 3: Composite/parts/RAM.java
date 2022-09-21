package parts;

import composite.Parts;

public class RAM implements Parts {

	public double price;
	
	public RAM(double p) {
		this.price = p;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "RAM -";
	}

}