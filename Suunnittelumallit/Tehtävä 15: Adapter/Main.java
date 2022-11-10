package tsydeemi;

public class Main {

	public static void main(String[] args) {
		
		Kiriko kiriko = new Kiriko();
		
		KirikoClone kirikoClone = new KirikoClone();
		
		AllyHealer cloneAdapter = new KirikoCloneAdapter(kirikoClone);		
		
		System.out.println("The Kiriko clone");
		System.out.println("-------------------------------------------");
		
		kirikoClone.tryToThrowKunai();
		kirikoClone.tryToUseSuzu();
		
		System.out.println("\nThe real Kiriko");
		System.out.println("-------------------------------------------");
		
		kiriko.useSuzu();
		kiriko.throwKunai();
		
		System.out.println("\nThe Kiriko clone with an adapter");
		System.out.println("-------------------------------------------");
				
		cloneAdapter.throwKunai();
		cloneAdapter.useSuzu();
		
	}

}
