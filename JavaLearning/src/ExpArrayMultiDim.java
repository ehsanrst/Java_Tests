public class ExpArrayMultiDim {
	public static void main(String[] args) {

		int firstArray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		int secondArray[][] = { { 30, 31, 32, 35 }, { 44 }, { 4, 5, 6 } }; // multidimensional
		System.out.println("this is the first array:");
		display(firstArray);
		System.out.println("\nthis is the second array:");
		display(secondArray);
	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			System.out.println("row " + (row + 1) + "\n=====");
			for (int column = 0; column < x[row].length; column++) {
				System.out.println(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
