import java.util.Scanner;

public class Test { //add menu

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		boolean p = true;
		boolean q = true;

		Calculate cal = new Calculate();// default constructor
		Scanner scan = new Scanner(System.in);

		System.out.println("Calculator**more help? (true/false)");
		q = scan.nextBoolean();
		if (q == true) {
			System.out
					.println("This prog take a value and b value and calculate:");
			System.out.println("triangle area, triangle surface, a^b");
		}
		while (p == true) {

			System.out.println("Enter a value:");
			a = scan.nextDouble();
			System.out.println("Enter b value:");
			b = scan.nextDouble();

			cal.seteNum(a);
			cal.seteNum2(b);

			double area = cal.area();
			double surface = cal.multiplication();
			double power = cal.power();

			System.out.println("area value =" + area);
			if (a < 0 || b < 0) {
				System.out.println("surface Unknown");
			} else {
				System.out.println("surface value =" + surface);
			}

			System.out.println("power value =" + power);
			System.out.println("Do you want to repeat? (true/false)");

			p = scan.nextBoolean();
		}
	}
}
