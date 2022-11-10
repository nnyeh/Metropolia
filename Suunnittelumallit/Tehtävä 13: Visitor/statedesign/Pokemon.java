package statedesign;

import states.Pichu;
import states.Pikachu;
import states.Raichu;
import visitor.PokemonVisitor;

public class Pokemon {

	PokemonState pichu;
	PokemonState pikachu;
	PokemonState raichu;

	PokemonState pokemonState;

	public Pokemon() {
		pichu = new Pichu(this);
		pikachu = new Pikachu(this);
		raichu = new Raichu(this);

		pokemonState = pichu;
	}

	public void setPokemonState(PokemonState newPokemonState) {
		pokemonState = newPokemonState;
	}

	public void getName() {
		pokemonState.getName();
	}

	public void type() {
		pokemonState.pokemonType();
	}

	public void useMove() {
		pokemonState.useMove();
	}

	public void weakness() {
		pokemonState.pokemonWeakness();
	}

	public void accept(PokemonVisitor v) {
		pokemonState.accept(v);
	}

	public void evolve() {
		pokemonState.evolve();
	}

	public PokemonState getPichu() {
		return pichu;
	}

	public PokemonState getPikachu() {
		return pikachu;
	}

	public PokemonState getRaichu() {
		return raichu;
	}

}