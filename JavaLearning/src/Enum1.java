// Enumeration to make Constants

public enum Enum1 {

	// Enum : Constants (with two String factors)
	Ehsan("Good boy", "26"), Mohamad("Best friend", "26"), Ali("Good friend",
			"27"), Alireza("kind and warm", "24");

	// enum's variables
	private final String desc; // Description
	private final String year; /*
								 * final means that name and value we choose
								 * here never able to change
								 */

	// Constructor
	private Enum1(String desc, String year) {
		this.desc = desc;
		this.year = year;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}

}
