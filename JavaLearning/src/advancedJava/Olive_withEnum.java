package advancedJava;

public class Olive_withEnum {

	public static final long BLACK = 0x000000;
	public OliveName_Enum oliveName; // use Enum
	public long color = BLACK;

	public Olive_withEnum() {
	}

	public Olive_withEnum(OliveName_Enum oliveName) {
		this.oliveName = oliveName;
	}

	public Olive_withEnum(OliveName_Enum oliveName, long color) {
		this(oliveName);
		this.color = color;
	}

	public String toString() {
		return "name: " + this.oliveName + " color: " + this.color;
	}

}
