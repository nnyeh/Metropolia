package tsydeemi;

public class Thread1 extends Thread {

	NumberList numberlist;
	
	public Thread1(NumberList numberlist) {
		this.numberlist = numberlist;
	}	 

	@Override
	public void run() {
		numberlist.iterate1();
	}
	
}