package tsydeemi;

public class Main {	
	
	public static void main(String[] args) {
	
		SilverScreen silverscreen = new SilverScreen();
		
		Command switchUp = new FlipUpCommand(silverscreen);
		Command switchDown = new FlipDownCommand(silverscreen);
		
		WallButton button1 = new WallButton(switchUp);
		WallButton button2 = new WallButton(switchDown);
		
		button1.push();
		button2.push();
	}
	
}
