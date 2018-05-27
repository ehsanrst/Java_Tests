package advancedJava;

public class Olive {

	public static final long BLACK = 0x000000;
	// public, all can use, never can change, type, name

	public String oliveName;
	// OR use Enum type
	// public OliveName_Enum oliveName;
	public long color = BLACK;

	// OR: public long color = 0x000000; // Color.BLACK

	public Olive() {
	}

	// public Olive(String oliveName) {
	// this.oliveName = oliveName;
	// }

	// OR use Enum type
	public Olive(String oliveName) {
		this.oliveName = oliveName;
	}

	// public Olive(String oliveName, long color) {
	// this(oliveName);
	// this.color = color;
	// }

	// OR use Enum type
	public Olive(String oliveName, long color) {
		this(oliveName);
		this.color = color;
	}

	public String toString() {
		return "name: " + this.oliveName + " color: " + this.color;
	}

}
