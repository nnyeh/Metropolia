package parts;

import composite.Parts;

// Network interface controller
public class NIC implements Parts {
	
	public double price;

	public NIC(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Verkkokortti -";
	}

}