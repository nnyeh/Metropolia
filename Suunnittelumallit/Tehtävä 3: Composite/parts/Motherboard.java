package parts;

import java.util.ArrayList;
import java.util.List;

import composite.Parts;

public class Motherboard implements Parts {
	
	private List<Parts> moboParts = new ArrayList<Parts>();
	
	public double moboPrice;

	public Motherboard(double p) {
		this.moboPrice = p;
		RAM ram = new RAM(90);
		moboParts.add(ram);
	}
	
	@Override
	public double getPrice() {
		double price = 0;
		for(Parts p : moboParts) {
			price = price + p.getPrice();
		}		
		return moboPrice + price;		
	}
	
	@Override
	public String toString() {
		return "Emolevy -";
	}

}