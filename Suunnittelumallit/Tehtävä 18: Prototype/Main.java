package prototype;

public class Main {

	public static void main(String[] args) {

		CloneFactory clockMaker = new CloneFactory();
		AnalogClock aClock = new AnalogClock();
		AnalogClock clone1 = (AnalogClock) clockMaker.getShallowClone(aClock);		
		AnalogClock clone2 = aClock.makeDeepCopy();		
		AnalogClock clone3 = (AnalogClock) clockMaker.getDeepClone(aClock);		

		System.out.println("\nThe time of aClock is " + aClock.getTime());
		System.out.println("The time of clone1 is " + clone1.getTime());
		System.out.println("The time of clone2 is " + clone2.getTime());		
		System.out.println("The time of clone3 is " + clone3.getTime());		
		
		System.out.println("\n\nChanging the time of aClock");
		System.out.println("------------------------------");
		
		aClock.changeTime(15, 45, 27);
		
		System.out.println("The time of aClock is " + aClock.getTime());
		System.out.println("The time of clone1 is " + clone1.getTime());
		System.out.println("The time of clone2 is " + clone2.getTime());		
		System.out.println("The time of clone3 is " + clone3.getTime());
		
		System.out.println("\n\nChanging the time of clone1");
		System.out.println("------------------------------");
		
		clone1.changeTime(21, 52, 18);
		
		System.out.println("The time of aClock is " + aClock.getTime());
		System.out.println("The time of clone1 is " + clone1.getTime());
		System.out.println("The time of clone2 is " + clone2.getTime());		
		System.out.println("The time of clone3 is " + clone3.getTime());
				
		System.out.println("\n\nChanging the time of clone2");
		System.out.println("-----------------------------");
		
		clone2.changeTime(03, 36, 41);
		
		System.out.println("The time of aClock is " + aClock.getTime());
		System.out.println("The time of clone1 is " + clone1.getTime());
		System.out.println("The time of clone2 is " + clone2.getTime());		
		System.out.println("The time of clone3 is " + clone3.getTime());
				
		System.out.println("\n\nChanging the time of clone3");
		System.out.println("------------------------------");
		
		clone3.changeTime(11, 28, 04);
		
		System.out.println("The time of aClock is " + aClock.getTime());
		System.out.println("The time of clone1 is " + clone1.getTime());
		System.out.println("The time of clone2 is " + clone2.getTime());		
		System.out.println("The time of clone3 is " + clone3.getTime());
		
	}

}
