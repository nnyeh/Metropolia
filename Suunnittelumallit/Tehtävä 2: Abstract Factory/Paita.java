package tsydeemi;

public abstract class Paita {
	
	String merkki;

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Paita: " + merkki;
	}
}