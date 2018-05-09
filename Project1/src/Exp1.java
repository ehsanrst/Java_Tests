import java.util.Scanner;

public class Exp1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Exp1Method object = new Exp1Method(); // build object

		// first lesson ===========================
		object.method();
		object.method2();

		// second lesson ===========================
		System.out.println("What's your name?");
		String esm = scan.nextLine();
		object.simpleMessage(esm);

		// third lesson ===========================
		System.out.println("Please Enter your mother's name?");
		String temp = scan.nextLine();
		object.setGirlName(temp); // initial object
		object.sayingG();

		// 4th lesson ===========================
		System.out.println("Please Enter your Father's name?");
		String temp2 = scan.nextLine();
		Exp1Method object2 = new Exp1Method(temp2); // initial with build object
		object2.sayingB();

	}
}
