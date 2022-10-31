package tsydeemi;

public abstract class RaiseAmount {
	
	protected static final double BASE = 2;
	private RaiseAmount successor;

	public void setSuccessor(RaiseAmount successor) {
		this.successor = successor;
	}

	public void processRequest(SalaryIncreaseRequest request) {
		if (successor != null) {
			successor.processRequest(request);
		}
	}
	
}