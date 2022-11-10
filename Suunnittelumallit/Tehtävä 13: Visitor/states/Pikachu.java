package states;

import statedesign.Pokemon;
import statedesign.PokemonState;
import visitor.PokemonVisitor;

public class Pikachu implements PokemonState {

	Pokemon pokemon;

	public Pikachu(Pokemon newPokemon) {
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
		System.out.println("\nPikachu evolves into Raichu\n");
		pokemon.setPokemonState(pokemon.getRaichu());
	}

	@Override
	public void getName() {
		System.out.println("Name: Pikachu");
	}

	@Override
	public void accept(PokemonVisitor v) {
		v.visitPikachu(this);
	}

}