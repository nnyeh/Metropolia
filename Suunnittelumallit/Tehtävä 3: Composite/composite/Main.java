package composite;

import parts.Case;
import parts.GPU;
import parts.Memory;
import parts.Motherboard;
import parts.NIC;
import parts.CPU;

public class Main {

	public static void main(String[] args) {
		
		Computer pc = new Computer();
		
		Case c = new Case(124);
		NIC nic = new NIC(47);
		Memory mem = new Memory(96);
		CPU cpu = new CPU(278);		
		GPU gc = new GPU(599);
		Motherboard mobo = new Motherboard(214);	
		
		pc.addPart(c);
		pc.addPart(nic);
		pc.addPart(mem);
		pc.addPart(cpu);
		pc.addPart(gc);
		pc.addPart(mobo);
		
		System.out.println(pc.getPrice());

	}
	
}