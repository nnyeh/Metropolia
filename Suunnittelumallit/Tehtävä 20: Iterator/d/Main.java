package tsydeemi;

public class Main {

	public static void main(String[] args) {

		NumberList numberlist = new NumberList();
		
		Thread1 thread1 = new Thread1(numberlist);
		Thread2 thread2 = new Thread2(numberlist);			
		
		thread1.start();	
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("\n");
		thread2.start();
		
	}
}
