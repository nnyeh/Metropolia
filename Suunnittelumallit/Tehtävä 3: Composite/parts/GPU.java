package parts;

import composite.Parts;

public class GPU implements Parts {

	public double price;
	
	public GPU(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Näytönohjain -";
	}

}