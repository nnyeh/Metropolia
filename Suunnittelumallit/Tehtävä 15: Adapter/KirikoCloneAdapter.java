package tsydeemi;

public class KirikoCloneAdapter implements AllyHealer {

	KirikoClone clone;	
	
	public KirikoCloneAdapter(KirikoClone newClone) {
		clone = newClone;		
	}
	
	@Override
	public void throwKunai() {		
		clone.tryToThrowKunai();
	}

	@Override
	public void useSuzu() {		
		clone.tryToUseSuzu();
	}

}