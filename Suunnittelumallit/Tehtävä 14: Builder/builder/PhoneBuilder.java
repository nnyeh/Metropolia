package builder;

public interface PhoneBuilder {
	
	public abstract void createNewPhone();
	public abstract void buildScreen();
	public abstract void buildCPU();
	public abstract void buildGPU();	
	
	public abstract Object getPhone();

}