package d;


public class Thread1 extends Thread {

	NumberList nl;
	
	public Thread1(NumberList nl) {
		this.nl = nl;
	}
	 

	@Override
	public void run() {

		nl.iterate();
	}

	
}
