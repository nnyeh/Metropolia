package tsydeemi;

public class Main {
	
	// puhelinnumero-katalogi
	
	public static void main(String[] args) {

		PhoneNumber phonenumber = PhoneNumber.getInstance();
		
		Name name = new Name("Matti Meikäläinen", phonenumber);

		System.out.println(name.toString());

	}
}
