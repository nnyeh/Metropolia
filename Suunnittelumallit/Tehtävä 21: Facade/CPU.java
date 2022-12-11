package tsydeemi;

public class CPU {
	
	public void Freeze() {		
		System.out.println("Freeze");
	}

	public void Jump(long position) {
		System.out.println("Jump: " + position);
	}

	void Execute() {
		System.out.println("Executing");
	}	
	
}