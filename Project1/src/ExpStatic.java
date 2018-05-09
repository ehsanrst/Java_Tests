public class ExpStatic {
	// non-static variables
	private int num = 3;
	private final int num2 = 30;

	// static variable
	private static int num3 = 40;

	public static void main(String[] args) {
		// main method always must be static
		print();
		// can't use print2();
	}

	public static void print() {
		// other method if be static can use inside main
		System.out.println("Salam");
	}

	public void print2() {
		// non-static and can't be use in main
		System.out.println(num);
		// but this can accept non-static variables insted

	}
}
