package statedesign;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Archon archon = new Archon();
		
		int x = 0;
		
		while (x <= 3) {
			
			if (x == 0) {
				archon.setArchonStateToLVL5();
				archon.getName();
				archon.godLevel();
				archon.killEnemy();
				archon.levelUp();				
			}
			
			else if (x == 1) {
				archon.setArchonStateToLVL10();
				archon.getName();
				archon.godLevel();
				archon.killEnemy();
				archon.levelUp();
			}
			
			else if (x == 2) {
				archon.setArchonStateToLVL15();
				archon.getName();
				archon.godLevel();
				archon.killEnemy();
				archon.levelUp();
			}
			
			else if (x == 3) {
				archon.setArchonStateToLVL20();
				archon.getName();
				archon.godLevel();
				archon.killEnemy();
				archon.levelUp();
			}
			
			x++;
			
		}
		
	}
}
