import builder.SamsungBuilder;
import builder.OnePlusBuilder;
import director.Director;
import samsung.Phone;
import oneplus.OnePlus;

public class Main {
	public static void main(String[] args) {

		Director director = new Director();

		SamsungBuilder samsung = new SamsungBuilder();

		director.setPhoneBuilder(samsung);
		director.createPhone();
		
		Phone component = samsung.getPhone();
		System.out.println(component);
		
		OnePlusBuilder op = new OnePlusBuilder();

		director.setPhoneBuilder(op);
		director.createPhone();
		
		OnePlus oneplus = op.getPhone();
		System.out.println(oneplus);

	}
}
