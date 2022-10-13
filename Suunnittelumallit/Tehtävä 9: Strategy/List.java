package tsydeemi;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	private String name;

	public ListConverter listType;
	
	public ArrayList<Integer> listOfNumbers() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		return list;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}
	
}