package samsung;

import java.util.ArrayList;

public class Phone {
	
	public Screen screen;
	public CPU cpu;
	public GPU gpu;
	
	ArrayList<Object> phone = new ArrayList<Object>();

	public Phone() {
		
	}
		
	public void addToPhone(Object o) {
		phone.add(o);
	}
	
	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
		phone.add(screen);
	}

	public CPU getCPU() {
		return cpu;
	}

	public void setCPU(CPU cpu) {
		this.cpu = cpu;
		phone.add(cpu);
	}
	
	public void setGPU(GPU gpu) {
		this.gpu = gpu;
		phone.add(gpu);
	}
	
	@Override
	public String toString() {
		String s = "Samsung: " + cpu + ", " + screen + ", " + gpu;
		return s;
	}
	
	public void printPhone() {
		for(Object o : phone) {
			System.out.println(o.toString());
		}
	}	
	
}