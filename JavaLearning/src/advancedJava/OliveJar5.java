package advancedJava;

//Test5 
//use Class in method
import java.util.ArrayList;

public class OliveJar5 {

	public ArrayList<Olive> olives;

	// initializer
	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Golden", 0xDA9100));
	}

	public OliveJar5() {
		System.out.println("Constructor...");
	}

	public OliveJar5(int nOlive, String oliveName, long color) {
		for (int i = 0; i < nOlive; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	// methods
	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}

	public void reportOlives() {

		/* Inner_Local_Class: Class in method */
		class JarLid { // it's Private by itself
			public void open() {
				System.out.println("Go");
				System.out.println("wait!");
			}
		}
		new JarLid().open(); // use class (new constructor.method)
		/* end */

		/* Unknown_Inner_Local_Class: Object class */
		new Object() {// Object class exist in java
			public void open() {
				System.out.println("Go");
				System.out.println("wait!");
			}
		}.open();// open object class
		/* end */

		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!");
		}
	}

	// ENCAPCULATE olive class in oliveJar4
	// Olive Class Non_Public is a member class
	class Olive {
		public static final long BLACK = 0x000000;

		public String oliveName;
		public long color = BLACK;

		public Olive() {
		}

		public Olive(String oliveName) {
			this.oliveName = oliveName;
		}

		public Olive(String oliveName, long color) {
			this(oliveName);
			this.color = color;
		}

		public String toString() {
			return "name: " + this.oliveName + " color: " + this.color;
		}
	}

}