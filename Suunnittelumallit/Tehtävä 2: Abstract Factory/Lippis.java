package tsydeemi;

public abstract class Lippis {
	
	String merkki;

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Lippis: " + merkki;
	}
}