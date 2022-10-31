package tsydeemi;

public class Director extends RaiseAmount {
	
	private final double permittable = BASE;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() > permittable && request.getAmount() < 5) {
			System.out.println("Request your raise of " + request.getAmount() + "% from the director.\n");
		} else {
			super.processRequest(request);
		}
	}
	
}
