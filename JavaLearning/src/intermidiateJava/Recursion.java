package intermidiateJava;

/*Lesson4: Recursion (Recursive method)
 * means that made a method that call itself
 */
public class Recursion {
	public static void main(String[] args) {
		int n = 15;
		System.out.println(fact(n));
	}

	// factorial method (Recursive method)
	public static long fact(long num) {
		if (num <= 1) {
			return 1;
			// dead point of recursion(must be first)
		} else {
			return num * fact(num - 1);
			// call method in itself
		}
	}
	/*
	 * means when we need to use a method continuously from the first of it but
	 * any step with a different parameter we can use Recursion
	 */
}
