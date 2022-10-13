package tsydeemi;

public class Main {

	public static void main(String[] args) {
		
		List list = new List();
		
		FirstList firstList = new FirstList();
		SecondList secondList = new SecondList();
		ThirdList thirdList = new ThirdList();

		System.out.println(firstList.listToString(list.listOfNumbers()));		
		System.out.println(secondList.listToString(list.listOfNumbers()));		
		System.out.println("\n" + thirdList.listToString(list.listOfNumbers()));
		
	}
}
