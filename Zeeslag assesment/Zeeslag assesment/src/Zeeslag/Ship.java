package Zeeslag;

public class Ship {

	private int length;
	private String type;
	private int hits;
	
	public Ship(int length, String type, int hits) {
		this.length = length;
		this.type = type;
		this.hits = hits;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isSunk() {
		boolean isSunk = false;
		if(hits == length) {
			isSunk = true;
		}
		return isSunk; 
	}
	
	public char getLetter() {
		char letter = type.charAt(0);
		return letter;
	}
	
	public void printShip() {
		System.out.println("Ship type: " + type + " length is: " + length + " has been hit " + hits + " times.");
		System.out.println(getLetter());
	}

	
}
