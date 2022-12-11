package prototype;

public class CloneFactory {
	
	public Clock getShallowClone(Clock clock) {		
		return clock.makeShallowCopy();
	}
	
	public Clock getDeepClone(AnalogClock clock) {			
		return clock.makeDeepCopy();
	}
	
}