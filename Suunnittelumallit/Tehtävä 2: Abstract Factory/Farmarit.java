package tsydeemi;

public abstract class Farmarit extends Vaatevalinta {
	
	String merkki;

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	} 
	
	@Override
	public String toString() {
		return "Farmarit: " + this.farmarit;
	}
}
