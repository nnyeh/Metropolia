package tsydeemi;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ClockTimer timer = new ClockTimer();
		Digital clock = new Digital(timer);		
		timer.addObserver(clock);

		new Thread(timer).start();

		try {Thread.sleep(50000);} catch (InterruptedException e) {e.printStackTrace();}

		timer.stop();	
		
	}
}
