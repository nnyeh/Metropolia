package tsydeemi;

public abstract class Vaatevalinta {
	
	Farmarit farmarit;
	Paita paita;
	Lippis lippis;
	Kengät kengät;
	
	public abstract void luoFarmarit(String merkki);
	public abstract void luoPaita(String merkki);
	public abstract void luoLippis(String merkki);
	public abstract void luoKengät(String merkki);

}