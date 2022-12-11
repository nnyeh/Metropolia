package tsydeemi;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Iterator<Integer> iterator;

	public NumberList() {
		addNumbers();
		iterator = numbers.iterator();
	}

	public void addNumbers() {
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
	}

	public void iterate() {
		while (iterator.hasNext()) {
			System.out.println("Thread 1: " + iterator.next());
		}
	}

	public void iterate2() {
		while (iterator.hasNext()) {
			System.out.println("Thread 2: " + iterator.next());
		}
	}

}