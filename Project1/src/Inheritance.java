//Inheritance lesson

public class Inheritance {
	public static void main(String[] args) {
		InheritClass1.print();
		InheritClass2.print();
		// Class2 inherit print method from Class1
		InheritClass3.print();
		/*
		 * Class3 inherit from Class1 but will use local methods first and
		 * override it
		 */
	}
}
