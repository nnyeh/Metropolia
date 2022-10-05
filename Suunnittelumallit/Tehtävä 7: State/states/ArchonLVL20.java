package states;

import statedesign.Archon;
import statedesign.ArchonState;

public class ArchonLVL20 implements ArchonState {

Archon archon;
	
	public ArchonLVL20(Archon newArchon) {
		archon = newArchon;
	}
		
	@Override
	public void getName() {
		System.out.println("Name: Archon");
	}
	
	@Override
	public void godLevel() {
		System.out.println("Level: 20");
	}

	@Override
	public void killEnemy() {
		System.out.println("Execute the enemy with Hovering Death");
	}

	@Override
	public void levelUp() {
		System.out.println("Archon cannot level up further since he's already max level\n");
	}

}