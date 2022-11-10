package states;

import statedesign.Pokemon;
import statedesign.PokemonState;
import visitor.PokemonVisitor;

public class Raichu implements PokemonState {

	Pokemon pokemon;
	
	public Raichu(Pokemon newPokemon) {
		pokemon = newPokemon;
	}

	@Override
	public void pokemonType() {
		System.out.println("Type: Electric");
	}

	@Override
	public void useMove() {
		System.out.println("Use Static!");
	}

	@Override
	public void pokemonWeakness() {
		System.out.println("Weakness: Ground");
	}

	@Override
	public void evolve() {
		System.out.println("\nRaichu cannot evolve further.\n");
	}

	@Override
	public void getName() {
		System.out.println("Name: Raichu");
	}

	@Override
	public void accept(PokemonVisitor v) {
		v.visitRaichu(this);
	}

}