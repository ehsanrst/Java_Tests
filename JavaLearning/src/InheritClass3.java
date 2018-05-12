//Child Class: Class3 is Class1
public class InheritClass3 extends InheritClass1 {
	// Override print method over parent print method
	public static void print() {
		/*
		 * ATTENTION: IF this override method be non-static then we can use
		 * 
		 * @Override TAG before this method here!!!
		 */
		System.out.println("print in Class3");
	}

}
