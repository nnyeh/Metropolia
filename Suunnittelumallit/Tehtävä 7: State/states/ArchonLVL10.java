package states;

import statedesign.Archon;
import statedesign.ArchonState;

public class ArchonLVL10 implements ArchonState {

Archon archon;
	
	public ArchonLVL10(Archon newArchon) {
		archon = newArchon;
	}
		
	@Override
	public void getName() {
		System.out.println("Name: Archon");
	}
	
	@Override
	public void godLevel() {
		System.out.println("Level: 10");
	}

	@Override
	public void killEnemy() {
		System.out.println("Chase down the enemy with Scent of Death");
	}

	@Override
	public void levelUp() {
		System.out.println("Archon leveled to 15 after killing enemies\n");
	}

}