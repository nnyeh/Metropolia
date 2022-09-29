package tsydeemi;

import java.util.Observer;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Digital implements Observer {

	private ClockTimer timer;
	
	public Digital(ClockTimer t) {
		timer = t;
	}
	
	@Override
	public void update(Observable p1, Object p2) {
		draw();
	}
	
	private void draw() {
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();
		System.out.println("Digitaalinen kello: " + hour + ":" + minute + ":" + second);
	}
	
}