package tsydeemi;

public class RollTheDie extends Game {
	
	private int die1;
	private int die2;
	private int sum;
	private int winner;	
	private boolean x = false;
	
	public int throwTwoDice() {
		
		die1 = (int)(Math.random() * 6) + 1;	
		die2 = (int)(Math.random() * 6) + 1;
		
		sum = die1 + die2;
		return sum;
		
	}
		
	@Override
	void initializeGame() {		
	}

	@Override
	void makePlay(int player) {
		
		throwTwoDice();
		System.out.println("Player" + player + " threw " + sum);

		if(sum == 2) {
			x = true;
			winner = player;			
		}
		
	}

	@Override
	boolean endOfGame() {
		
		if (x) {
			return true;
		}
		return false;
		
	}

	@Override
	void printWinner() {

		System.out.println("\nThe winner is Player" + winner);
		
	}
}
