package tsydeemi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		CEO ceo = new CEO();
		Director director = new Director();
		Manager manager = new Manager();		
		
		manager.setSuccessor(director);
		director.setSuccessor(ceo);
		
		System.out.println("All requests will be in percents.\n\n");
		
		try {
			while (true) {
				System.out.print("Enter your requested salary increase: ");
				int i = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new SalaryIncreaseRequest(i, "General"));
			}
		} catch (Exception e) {
			System.exit(1);
		}
		
	}
}
