package advancedJava;

//Test4
import java.util.ArrayList;

public class OliveJar4 {

	public ArrayList<Olive> olives;

	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Parvardeh", 0x000000));
	}

	public OliveJar4() {
		System.out.println("Constructor...");
	}

	public OliveJar4(int nOlive, String oliveName, long color) {
		for (int i = 0; i < nOlive; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	// methods
	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}

	public void reportOlives() {
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