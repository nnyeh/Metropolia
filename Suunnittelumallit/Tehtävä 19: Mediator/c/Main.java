package tsydeemi;

public class Main {

	public static void main(String[] args) {

		NumberList numberlist = new NumberList();
		
		Thread2 thread2 = new Thread2(numberlist);			
		
		thread2.start();
		
	}
}
