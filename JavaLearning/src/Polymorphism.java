//Polymorphism

public class Polymorphism {
	public static void main(String[] args) {

		PolyClass2 obj1 = new PolyClass2();
		PolyClass1 obj2 = new PolyClass2(); // polymorphism
		/*
		 * because class2 have any thing of class1, objects we made from class2
		 * can have type of class1
		 */

		// PolymorPhic Array
		PolyClass1 arr[] = new PolyClass1[2]; // have 2 subClass
		arr[0] = new PolyClass2(); // make object from PolyClass2
		arr[1] = new PolyClass3(); // make object from PolyClass3

		// OR:
		// PolyClass1 arr[] = {new PolyClass2(), new PolyClass3()};
		/*
		 * means when you call number of array this go there and do methods in
		 * it
		 */

		// OR:
		for (int i = 0; i < arr.length; i++) {
			arr[i].eat(); // call method
		}
		/*
		 * use for loop when we have many subClasses, then no need to make
		 * objects separately, just use them and their methods
		 */
		
	}
}
