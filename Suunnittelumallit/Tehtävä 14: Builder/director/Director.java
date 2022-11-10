package director;

import builder.PhoneBuilder;

public class Director {
	
	private PhoneBuilder phonebuilder;	
	
	public void setPhoneBuilder(PhoneBuilder builder) {
		phonebuilder = builder;
	}
	
	public void createPhone() {
		phonebuilder.createNewPhone();
		phonebuilder.buildScreen();
		phonebuilder.buildCPU();
		phonebuilder.buildGPU();
	}

}