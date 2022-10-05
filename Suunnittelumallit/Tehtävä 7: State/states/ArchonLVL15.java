package states;

import statedesign.Archon;
import statedesign.ArchonState;

public class ArchonLVL15 implements ArchonState {

Archon archon;
	
	public ArchonLVL15(Archon newArchon) {
		archon = newArchon;
	}
		
	@Override
	public void getName() {
		System.out.println("Name: Archon");
	}
	
	@Override
	public void godLevel() {
		System.out.println("Level: 15");
	}

	@Override
	public void killEnemy() {
		System.out.println("Get the kill with Soul Reap");
	}

	@Override
	public void levelUp() {
		System.out.println("Archon leveled to 20 after killing enemies\n");
	}

}