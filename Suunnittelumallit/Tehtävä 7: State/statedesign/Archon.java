package statedesign;

import states.ArchonLVL5;
import states.ArchonLVL10;
import states.ArchonLVL15;
import states.ArchonLVL20;

public class Archon {
	
	ArchonState archonLVL5;
	ArchonState archonLVL10;
	ArchonState archonLVL15;
	ArchonState archonLVL20;	
		
	ArchonState archonState;	
	
	public Archon() {		
		archonLVL5 = new ArchonLVL5(this);
		archonLVL10 = new ArchonLVL10(this);
		archonLVL15 = new ArchonLVL15(this);
		archonLVL20 = new ArchonLVL20(this);
		
		archonState = archonLVL5;
	}
	
	public void setArchonState(ArchonState newArchonState) {
		archonState = newArchonState;
	}
	
	public void getName() {
		archonState.getName();
	}
	
	public void godLevel() {
		archonState.godLevel();
	}
	
	public void killEnemy() {
		archonState.killEnemy();
	}
	
	public void levelUp() {
		archonState.levelUp();
	}	
	
	public void setArchonStateToLVL5() {
		archonState = archonLVL5;
	}
	
	public void setArchonStateToLVL10() {
		archonState = archonLVL10;
	}
	
	public void setArchonStateToLVL15() {
		archonState = archonLVL15;
	}
	
	public void setArchonStateToLVL20() {
		archonState = archonLVL20;
	}
	
}