package statedesign;

import visitor.PokemonVisitor;

public interface PokemonState {

	public void pokemonType();

	public void useMove();

	public void pokemonWeakness();

	public void evolve();

	public void getName();

	void accept(PokemonVisitor v);
	
}