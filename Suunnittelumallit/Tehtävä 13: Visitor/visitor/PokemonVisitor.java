package visitor;

import states.Pichu;
import states.Pikachu;
import states.Raichu;

public interface PokemonVisitor {

	void visitPichu(Pichu pichu);
	void visitPikachu(Pikachu pikachu);
	void visitRaichu(Raichu raichu);
	
}