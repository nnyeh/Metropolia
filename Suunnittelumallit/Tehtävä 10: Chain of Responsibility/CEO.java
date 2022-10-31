package tsydeemi;

public class CEO extends RaiseAmount {
	
	private final double permittable = 5;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() >= permittable) {
			System.out.println("Request your raise of " + request.getAmount() + "% from the CEO.\n");
		}		
	}
	
}