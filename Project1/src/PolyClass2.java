//Sub Class 1
public class PolyClass2 extends PolyClass1 {

	@Override
	void eat() {
		System.out.println("class2 eats Meat");
	}

	/*
	 * Difference between Override and OverLoading is that override is when you
	 * completely copy superClass method in subClass "with it's parameters" then
	 * you change "what it going to do" but in OverLoadin you use same method in
	 * subClasses as their Parent have but with "different parameter"
	 */

	// OverLoading
	void eat(int x) {
		System.out.println("class2 eats Meat every" + x + "hours");
	}
	// this can't call by PolyClass4
}
