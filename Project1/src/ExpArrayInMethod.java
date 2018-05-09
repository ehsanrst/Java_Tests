public class ExpArrayInMethod {
	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 6, 7 }; // variable
		change(a); // call the method

		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void change(int x[]) {

		for (int counter = 0; counter < x.length; counter++) {
			x[counter] += 5;
		}
	}
}
