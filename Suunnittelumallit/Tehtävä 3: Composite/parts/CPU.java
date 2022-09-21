package parts;

import composite.Parts;

public class CPU implements Parts {
	
	public double price;

	public CPU(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Prosessori -";
	}

}