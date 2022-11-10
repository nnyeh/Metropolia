package statedesign;

import visitor.BonusVisitor;
import visitor.PokemonVisitor;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Pokemon pokemon = new Pokemon();

		PokemonVisitor visitor = new BonusVisitor();

		int i = 0;

		while (i <= 2) {
			
			pokemon.getName();
			pokemon.type();
			pokemon.weakness();
			pokemon.useMove();
			pokemon.accept(visitor);

			Thread.sleep(1000);

			pokemon.evolve();

			Thread.sleep(2000);
			
			i++;
		}
		
	}
}
