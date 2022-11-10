package oneplus;

public class OnePlus {

	private String screen = "";
	private String cpu = "";
	private String gpu = "";	
		
	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setCPU(String cpu) {
		this.cpu = cpu;
	}

	public void setGPU(String gpu) {
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		String build = "OnePlus: " + cpu + ", " + screen + ", " + gpu;
		return build;
	}

}