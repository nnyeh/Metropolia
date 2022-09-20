package tsydeemi;

public abstract class Kengät {
	
	String merkki;

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Kengät: " + merkki;
	}
}