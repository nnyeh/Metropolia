package tsydeemi;

public class Manager extends RaiseAmount {
	
	private final double permittable = BASE;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() <= permittable) {
			System.out.println("Request your raise of " + request.getAmount() + "% from the manager.\n");
		} else {
			super.processRequest(request);
		}
	}
	
}