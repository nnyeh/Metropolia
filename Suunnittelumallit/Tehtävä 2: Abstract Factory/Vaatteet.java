package tsydeemi;

public class Vaatteet extends Vaatevalinta {

	@Override
	public void luoFarmarit(String merkki) {
		System.out.println("Farmarit: " + merkki);
	}

	@Override
	public void luoPaita(String merkki) {
		System.out.println("Paita: " + merkki);
	}

	@Override
	public void luoLippis(String merkki) {
		System.out.println("Lippis: " + merkki);
	}

	@Override
	public void luoKengät(String merkki) {
		System.out.println("Kengät: " + merkki);
	}
}