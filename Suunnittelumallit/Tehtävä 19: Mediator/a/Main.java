package tsydeemi;

public class Main {

	public static void main(String[] args) {

		NumberList numberlist = new NumberList();
		
		Thread1 thread1 = new Thread1(numberlist);
		Thread2 thread2 = new Thread2(numberlist);			
		
		thread1.start();	
		thread2.start();
		
	}
}
