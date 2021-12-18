package Zeeslag;

public class Field {

	private int countShipsSunk;
	private Square[][] map = new Square[10][10];

	public Field() {
		map = new Square[10][10];
		
	}

	public void print() {
		System.out.println("\tA \tB \tC \tD  \tE  \tF  \tG  \tH  \tI  \tJ");

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
			for (int j = 0; j < 10; j++) {
				System.out.print("\t" + map[i][j]);
			}
			System.out.println();
		}

	}

	public void fire(String atPosition) {

	}

	public boolean areAllShipsSunk() {
		if (countShipsSunk >= 5) {
		}
		return true;
	}

}
