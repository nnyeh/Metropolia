package tsydeemi;

public class Kiriko implements AllyHealer {

	@Override
	public void throwKunai() {
		System.out.println("Kiriko throws a kunai and does 40 damage.");
	}

	@Override
	public void useSuzu() {
		System.out.println("Kiriko uses protection suzu and gains immunity for 1 second and heals for 50 health.");
	}

}