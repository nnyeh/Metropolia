package tsydeemi;

public class ComputerFacade {

	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	private long kBootAddress = 8000;
	private long kBootSector = 1000;
	private int kSectorSize = 512;
	
	public ComputerFacade(CPU cpu, Memory ram, HardDrive hdd) {		
		this.cpu = cpu;
		this.memory = ram;
		this.hardDrive = hdd;
	}	
	
	public void start() {		
		cpu.Freeze();
		memory.Load(kBootAddress, hardDrive.Read(kBootSector, kSectorSize));
		cpu.Jump(kBootAddress);
		cpu.Execute();		
	}
	
}
