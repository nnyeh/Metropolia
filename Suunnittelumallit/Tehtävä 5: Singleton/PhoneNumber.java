package tsydeemi;

public class PhoneNumber {

	private String name;
	private static final PhoneNumber instance = new PhoneNumber("0501234567");	
	
	public String getName() {
		return name;
	}
	
	private PhoneNumber(String string) {
		this.name = string;
	}	

	public static PhoneNumber getInstance() {
        return instance;
	}
	
}