package Zeeslag;

public class MainClass {

	public static void main(String[] args) {

		Ship s = new Ship(4, "S.S", 0);

		s.getLetter();
		s.printShip();

		System.out.println(Math.random() * 10);

		Field map = new Field();
		map.print();

	}

}
