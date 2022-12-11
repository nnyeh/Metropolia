package tsydeemi;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	public NumberList() {
		addNumbers();
	}

	public void addNumbers() {
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
	}

	public void iterate1() {
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println("Thread 1: " + iterator.next());
			numbers.remove(4);
		}
	}

	public void iterate2() {
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {			
			Integer i = iterator.next();			
			if (i < 3) {
				iterator.remove();
			}
		}
		System.out.println(numbers);
	}

}