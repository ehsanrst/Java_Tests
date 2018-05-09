public class Exp2TimeClass {
	public static void main(String[] args) {
		// TimeClass
		TimeClass object1 = new TimeClass();
		object1.setTime(17, 5, 24);
		System.out.println(object1.toMilitary());
		System.out.println(object1.toString());

		// TimeClass2
		TimeClass2 object2 = new TimeClass2();
		TimeClass2 object3 = new TimeClass2(5);
		TimeClass2 object4 = new TimeClass2(5, 13);
		TimeClass2 object5 = new TimeClass2(5, 13, 45);
		System.out.println(object2.toMilitary() + "\n" + object3.toMilitary()
				+ "\n" + object4.toMilitary() + "\n" + object5.toMilitary());

		// TimeClass3
		TimeClass3 object6 = new TimeClass3(4, 5, 6);

		// Composition
		TimeClass3 object7 = new TimeClass3(8, 13, 1991);
		Composition object8 = new Composition("Ehsan", object7);
		System.out.println(object8);

		/*
		 * NOTICE: here in print method we didn't use (object.methodName())!!!
		 * Why??? Well; Here, program need "object by itself" to be a "String"
		 * and this will happen with their toString methods in these classes or
		 * in their Parent's
		 */
	}
}
