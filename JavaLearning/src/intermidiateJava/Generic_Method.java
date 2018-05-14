package intermidiateJava;

//lesson 14: generic method : use when have many type of data

public class Generic_Method {
	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5 };
		Character[] c = { 'e', 'h', 's', 'a', 'n' };

		printMe(a); // need print method that accept integer
		printMe(c); // need print method that accept character

		// BUT we can use one method instead that call "Generic Method"
		printG(a);
		printG(c);
	}

	// print Integer
	public static void printMe(Integer[] i) {
		for (Integer x : i) {
			System.out.print(" " + x);
		}
		System.out.println();
	}

	// print Character
	// Overloading printMe
	public static void printMe(Character[] i) {
		for (Character x : i) {
			System.out.print(" " + x);
		}
		System.out.println();
	}

	// generic method======================
	public static <T> void printG(T[] i) {
		for (T x : i) {
			System.out.print(" " + x);
		}
		System.out.println();
	}
	/*
	 * <T> always be before return's type and means that we don't know the type
	 * of items and "T" will be their "temporary type"
	 */
}
