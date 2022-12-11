package d;


public class Thread2 extends Thread{

	NumberList nl;
	
	public Thread2(NumberList nl) {
		this.nl = nl;
	}

	
	
	@Override
	public void run() {
		
		nl.iterate2();
		
	}

	
}
