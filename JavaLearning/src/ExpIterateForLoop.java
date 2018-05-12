public class ExpIterateForLoop {
	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 6, 7 };
		int total = 0;

		for (int i : a) { // putting a[] values to i one by one
			total += i;
		}
		System.out.println("total:" + total);
	}
}
