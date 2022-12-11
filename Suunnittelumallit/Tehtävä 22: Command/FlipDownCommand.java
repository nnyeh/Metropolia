package tsydeemi;

public class FlipDownCommand implements Command {
	
	private SilverScreen silverscreen;

	public FlipDownCommand(SilverScreen silverscreen) {		
		this.silverscreen = silverscreen;
	}

	@Override
	public void execute() {
		silverscreen.down();
	}
	
}