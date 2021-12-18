package Zeeslag;

public class Square {

	private boolean wasShot;
	
	
	public Square() {
		wasShot = false;
		
	}
	
	public void shoot() {
		wasShot = true;
	}

	public boolean isWasShot() {
		return wasShot;
	}

	public void setWasShot(boolean wasShot) {
		this.wasShot = wasShot;
	}
	
	
}
