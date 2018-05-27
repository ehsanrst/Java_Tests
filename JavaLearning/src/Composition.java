// Composition is to use other Classes as type of another Class'es variables

public class Composition {

	private String name;
	private TimeClass3 birthday; // Composition (use TimeClass3 here as type)
	/* birthday is String */

	// Constructor
	public Composition(String name, TimeClass3 birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	/*
	 * Override: when you don't want to call a method of a class'es parent you
	 * must write a method completely the same with that method in child class
	 * that return your desire things this action call "Override"
	 */
	@Override
	public String toString() {
		return String
				.format("My name is %s, my birthday is %s", name, birthday);
		/*
		 * OR: // return String.format("my name is " + name +
		 * " , my birthday is " + birthday);
		 */

		// %s will change integers toString in your line

		/*
		 * ATTENTION: birthday is from type of TimeClass3; here in a String line
		 * we call birthday means birthday by itself must be String and we know
		 * it is NOT; so birthday use "toString" method in it's type class (in
		 * TimeClass3 Class) and return a String line to here; important problem
		 * here is birthday never return it's Constructor activities here
		 * because it is not necessary for this override method!!!
		 */
	}

}
