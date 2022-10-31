package tsydeemi;

public class SalaryIncreaseRequest {
	
	private String purpose;
	private int amount;	
	
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String reason) {
		purpose = reason;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amt) {
		amount = amt;
	}	
	
	public SalaryIncreaseRequest(int amount, String purpose) {
		this.amount = amount;
		this.purpose = purpose;
	}
	
}