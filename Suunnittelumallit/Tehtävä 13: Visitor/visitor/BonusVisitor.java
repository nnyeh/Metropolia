package visitor;

import states.Pichu;
import states.Pikachu;
import states.Raichu;

public class BonusVisitor implements PokemonVisitor {
	
	@Override
	public void visitPichu(Pichu pichu) {
		System.out.println("Pichu: +10 points");
	}

	@Override
	public void visitPikachu(Pikachu pikachu) {
		System.out.println("Pikachu: +15 points");
	}

	@Override
	public void visitRaichu(Raichu raichu) {
		System.out.println("Raichu: +20 points");
	}

}
