package tsydeemi;

public class Randomizer extends Thread{

	public Numbers host = new Numbers();
	private Object letter;
	private String playerName;
	private int playerID;
	public static int numberOfPlayers = 0;	
	private boolean gameOver = false;
	
	public Randomizer(String playerName) {
		numberOfPlayers++;
		this.playerName = playerName;
		this.playerID = numberOfPlayers;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerNumber) {
		this.playerID = playerNumber;
	}
	
	public void run() {
		
		letter = host.joinGame();		
		System.out.println("Player" + getPlayerID() + " is trying to guess the number " + host.getMementoNumber() + ".");
		
		while(gameOver == false) {			
			int random = (int)(Math.random() * 10) + 1;
			if (host.guessNumber(letter, random)) {
				System.out.println("Player" + getPlayerID() + " guessed " + random + " and it was correct!");
				gameOver = true;
			} else {
				System.out.println("Player" + getPlayerID() + " guessed wrong with " + random + ".");
			} try { 
				Thread.sleep(400);  
			} catch (Exception e) {
				System.out.println(e);
			}  
		}
		
	}
}