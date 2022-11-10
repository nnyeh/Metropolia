package builder;

import oneplus.OnePlus;

public class OnePlusBuilder implements PhoneBuilder {

	private OnePlus phone;
	
	@Override
	public void createNewPhone() {
		phone = new OnePlus();
	}

	@Override
	public void buildScreen() {
		phone.setScreen("Screen");
	}

	@Override
	public void buildCPU() {
		phone.setCPU("CPU");
	}

	@Override
	public void buildGPU() {
		phone.setGPU("GPU");
	}

	@Override
	public OnePlus getPhone() {
		return phone;
	}

}