package number;

import java.text.NumberFormat;

public class NewMain {
	public static void main(String[] args) {

		int numberOfOlives = 1_000_000_000;
		// can use "_" for better reading; no affect
		NumberFormat formater = NumberFormat.getInstance();
		// instance make "," between every 3 numbers
		System.out.println(formater.format(numberOfOlives));
	}
}
