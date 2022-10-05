package states;

import statedesign.Archon;
import statedesign.ArchonState;

public class ArchonLVL5 implements ArchonState {

Archon archon;
	
	public ArchonLVL5(Archon newArchon) {
		archon = newArchon;
	}
		
	@Override
	public void getName() {
		System.out.println("Name: Archon");
	}
	
	@Override
	public void godLevel() {
		System.out.println("Level: 5");
	}

	@Override
	public void killEnemy() {
		System.out.println("Finish off the enemy with Death Scythe");
	}

	@Override
	public void levelUp() {
		System.out.println("Archon leveled to 10 after killing enemies\n");
	}

}
