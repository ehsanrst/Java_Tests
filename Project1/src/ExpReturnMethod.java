public class ExpReturnMethod {
	public static void main(String[] args) {
		System.out.println(average(1.1f, 43, 65, 98, 5));
	}

	public static int average(float f, int... numbers) { // use ... when you
															// don't know
		// how many number you'll
		// receive
		int total = 0;

		for (int x : numbers) { // put numbers one by one into x
			total += x;
		}
		return total / numbers.length;
	}
}
