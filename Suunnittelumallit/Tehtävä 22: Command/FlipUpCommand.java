package tsydeemi;

public class FlipUpCommand implements Command {	
	
	private SilverScreen silverscreen;

	public FlipUpCommand(SilverScreen silverscreen) {		
		this.silverscreen = silverscreen;
	}

	@Override 
	public void execute() {
		silverscreen.up();
	}
	
}