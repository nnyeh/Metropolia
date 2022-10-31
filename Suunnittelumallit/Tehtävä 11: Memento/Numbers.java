package tsydeemi;

public class Numbers {

	public int theNumber;
	
	private class Memento {
		
		public int number;
		
		public Memento(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	}

	public Memento joinGame() {
		Object memento = createMementoNumber();
		return (Memento) memento;
	}

	public Object createMementoNumber() {		
		theNumber = (int) (Math.random() * 10) + 1;
		return new Memento(theNumber);
	}

	public int getMementoNumber() {
		return theNumber;
	}

	public synchronized boolean guessNumber(Object letter, int guess) {
		if (((Memento) letter).getNumber() == guess) {
			return true;
		} else {
			return false;
		}
	}
	
}