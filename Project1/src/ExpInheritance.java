//Inheritance lesson

public class ExpInheritance {
	public static void main(String[] args) {
		Class1.print();
		Class2.print();
		// Class2 inherit print method from Class1
		Class3.print();
		/*
		 * Class3 inherit from Class1 but will use local methods first and
		 * override it
		 */
	}
}
