package parts;

import java.util.ArrayList;
import java.util.List;

import composite.Parts;

public class Case implements Parts {

	private List<Parts> caseParts = new ArrayList<Parts>();
	
	public double casePrice;
	
	public Case(double p) {
		this.casePrice = p;
		Fans fan = new Fans(30);
		caseParts.add(fan);
	}	
	
	@Override
	public double getPrice() {		
		double price = 0;		
		for (Parts p : caseParts) {
			price = price + p.getPrice();
		}		
		return casePrice + price;		
	}
	
	@Override
	public String toString() {
		return "Kotelo -";		
	}
	
}