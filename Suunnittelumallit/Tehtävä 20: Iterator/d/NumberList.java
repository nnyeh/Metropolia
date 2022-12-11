package d;

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

	public void iterate() {

		Iterator<Integer> it = numbers.iterator();

		it.forEachRemaining((number) -> System.out.println(number));
	}

	public void iterate2() {

		Iterator<Integer> it = numbers.iterator();

		it.forEachRemaining((star) -> System.out.println("*"));

	}

}
