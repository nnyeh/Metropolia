package states;

import statedesign.Pokemon;
import statedesign.PokemonState;
import visitor.PokemonVisitor;

public class Pichu implements PokemonState {

	Pokemon pokemon;

	public Pichu(Pokemon newPokemon) {
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
		System.out.println("\nPichu evolves into Pikachu\n");
		pokemon.setPokemonState(pokemon.getPikachu());
	}

	@Override
	public void getName() {
		System.out.println("Name: Pichu");
	}

	@Override
	public void accept(PokemonVisitor v) {
		v.visitPichu(this);
	}

}