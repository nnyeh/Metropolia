package parts;

import composite.Parts;

public class Fans implements Parts {
	
	public double price;

	public Fans(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Tuulettimet -";
	}

}