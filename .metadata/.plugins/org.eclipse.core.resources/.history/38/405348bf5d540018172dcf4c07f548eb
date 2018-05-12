//PolymorPhic Argument

public class PolymorphicArgument {
	public static void main(String[] args) {
		// make object from class4
		PolyClass4 object = new PolyClass4();
		// for method of PolyClass4 we need object of PolyClass1 as parameter
		PolyClass1 food = new PolyClass1(); // to use method of class4

		// to access to child classes we need to build an object from them
		// but by polymorphism we just use their Constructors not the type
		PolyClass1 food2 = new PolyClass2(); // class1 access to class2
		PolyClass1 food3 = new PolyClass3(); // class1 access to class3

		// call method in PolyClass4 with his initial parameter
		object.digest(food);
		/*
		 * because PolyClass1 access to class 2&3 and is a parameter for method
		 * of class4, then class4 access them too cause it's method access to
		 * their methods; actually each parameter calls own method
		 */
		object.digest(food2);
		object.digest(food3);

	}
}
