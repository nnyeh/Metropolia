package composite;

import java.util.ArrayList;
import java.util.List;

import parts.*;

public class Computer implements Parts{
	
	private List<Parts> pc = new ArrayList<Parts>();
	
	public double price;
	
	public Case c;
	public NIC nic;
	public Memory mem;
	public CPU cpu;
	public GPU gc;	
	public Motherboard mobo;	

	@Override
	public double getPrice() {
		System.out.println("Tietokoneen osat\n----------------------------------------");
		for (Parts p : pc) {
			price = price + p.getPrice();
			System.out.println(p.toString() + " " + p.getPrice() + "€");
		}
		System.out.print("\nHinta euroina yhteensä: ");
		return price;
	}
	
	public void addPart(Parts p) {
		this.pc.add(p);
	}
	
	public void remove(Parts p) {
		pc.remove(p);
	}
	
	public void removeAll(Parts p) {
		System.out.println("Poistetaan kaikki osat koneesta...");
		this.pc.clear();
	}
	
}