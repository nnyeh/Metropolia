package tsydeemi;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();	
	
	public NumberList() {
		addNumbers();
	}	
	
	public void addNumbers() {		
		for(int i = 1; i <= 20; i++) {
			numbers.add(i);
		}
	}	

	public void iterate() {
		Iterator<Integer> iterator1 = numbers.iterator();
		while (iterator1.hasNext()) {
			System.out.println("Thread 1: " + iterator1.next());
		}
	}

	public void iterate2() {
		Iterator<Integer> iterator2 = numbers.iterator();
		while (iterator2.hasNext()) {
			System.out.println("Thread 2: " + iterator2.next());
		}
	}	
	
}
