package advancedJava;

//Test3
//with Non_StaticInit
import java.util.ArrayList;

public class Olive_Test3 {
	public static void main(String[] args) throws Exception {
		// first this main method will run, second static{}, then constructors
		System.out.println("Starting application...");/*
													 * FIRST (start main method)
													 */

		/*
		 * here we must "new" the "OliveJar2" because it is non_static
		 * (non_usable) from every where
		 */
		ArrayList<Olive> olives = new OliveJar3(3, "ede", 0x00FF00).olives; // using
		// initializer
		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!");/*
																	 * FORTH
																	 * (print)
																	 */
		}
	}
}
