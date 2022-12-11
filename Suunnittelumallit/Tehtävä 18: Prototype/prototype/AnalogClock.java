package prototype;

import hands.MinuteHand;
import hands.SecondHand;
import hands.HourHand;

public class AnalogClock implements Clock, Cloneable{

	private HourHand hHand;
	private MinuteHand mHand;
	private SecondHand sHand;

	public AnalogClock() {
		this.hHand = new HourHand(12);
		this.mHand = new MinuteHand(13);
		this.sHand = new SecondHand(14);
		System.out.println("An analog clock is being created");
	}

	public Clock makeShallowCopy() {

		System.out.println("A shallow copy analog clock is being created");

		try {
			return (Clock) super.clone();			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public AnalogClock makeDeepCopy() {

		System.out.println("A deep copy analog clock is being created");

		AnalogClock ac = null;

		try {
			ac = (AnalogClock) super.clone();
			ac.hHand = (HourHand) hHand.clone();
			ac.mHand =  (MinuteHand) mHand.clone();
			ac.sHand =  (SecondHand) sHand.clone();			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ac;
	}	
	
	public void changeTime(int hour, int minute, int seconds) {
		hHand.setHour(hour);
		mHand.setMinutes(minute);
		sHand.setSeconds(seconds);
	}

	public String getTime() {
		String s = hHand.getHour() + ":" + mHand.getMinutes() + ":" + sHand.getSeconds();
		return s;
	}	
	
	public HourHand getTViisari() {
		return hHand;
	}

	public MinuteHand getMViisari() {
		return mHand;
	}

	public SecondHand getSViisari() {
		return sHand;
	}

}