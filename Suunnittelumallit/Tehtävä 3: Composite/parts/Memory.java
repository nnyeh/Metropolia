package parts;

import composite.Parts;

public class Memory implements Parts {

	public double price;
	
	public Memory(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Muisti -";
	}

}