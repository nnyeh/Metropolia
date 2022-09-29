package tsydeemi;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockTimer extends Observable implements Runnable {

	public boolean stop = false;
	public int hour = 0;
	public int minute = 0;
	public int second = 0;	
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}	
		
	public void stop() {
		stop = true;
	}

	void tick() {
		notify();
	}

	@Override
	public void run() {
		
		while (!stop) {
			
			second++;
			
			if (second > 59) {
				minute++;
				second = 0;
			}
			
			if (minute > 59) {
				hour++;
				minute = 0;
				second = 0;
			}
			
			if (hour > 23) {
				hour = 0;
				minute = 0;
				second = 0;
			}
		
			setChanged();
			notifyObservers();
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			
		}
	}
}