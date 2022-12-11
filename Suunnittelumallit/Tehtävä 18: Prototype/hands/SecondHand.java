package hands;

public class SecondHand implements Cloneable {

	private int seconds;

	public SecondHand(int sec) {
		this.seconds = sec;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}