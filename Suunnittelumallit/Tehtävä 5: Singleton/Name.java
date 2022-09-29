package tsydeemi;

public class Name {

	public String name;
	PhoneNumber phonenumber = PhoneNumber.getInstance();
	
	public Name(String name, PhoneNumber phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Henkilön nimi on " + name + " ja hänen puhelinnumero on " + phonenumber.getName() + ".";
	}	
	
}