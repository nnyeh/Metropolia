package builder;

import samsung.Phone;
import samsung.Screen;
import samsung.CPU;
import samsung.GPU;

public class SamsungBuilder implements PhoneBuilder {

	private Phone phone;

	@Override
	public void createNewPhone() {
		phone = new Phone();
	}

	@Override
	public void buildScreen() {
		phone.setScreen(new Screen());
	}

	@Override
	public void buildCPU() {
		phone.setCPU(new CPU());
	}

	@Override
	public void buildGPU() {
		phone.setGPU(new GPU());
	}

	@Override
	public Phone getPhone() {
		return phone;
	}	
	
}