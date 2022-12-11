package tsydeemi;

public class Thread2 extends Thread {

	NumberList numberlist;
	
	public Thread2(NumberList numberlist) {
		this.numberlist = numberlist;
	}	
	
	@Override
	public void run() {		
		numberlist.iterate2();		
	}
	
}