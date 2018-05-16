package advancedJava;

//Test2
//with StaticInit
import java.util.ArrayList;

public class Olive_Test2 {
	public static void main(String[] args) throws Exception {
		// first this main method will run, second static{}, then constructors
		System.out.println("Starting application...");

		// "OliveJar1" is static and can use here without "new"
		ArrayList<Olive> olives = OliveJar2.olives; // use initializer
		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!");
		}
	}
}
