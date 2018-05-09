import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		double a = 1;
		double b = 1;
		double c = 1;
		boolean p = true;

		System.out.println(
				"This program wil help you to Calculate A^b");
		while (p == true) {
			System.out.println("Enter A value:");

			Scanner scan = new Scanner(System.in);
			a = scan.nextDouble();

			System.out.println("Now Enter b value:");
			b = scan.nextDouble();

			c = 1;

			if (b == 0) {
				c = 1;
			} else if (b > 0) {
				while (b != 0) {
					c = c * a;
					b--;
				}
			} else if (b < 0) {
				while (b != 0) {
					if (a == 0) {
						System.out.println("Answer is infinity.");
						break;
					}

					c = c * (1 / a);
					b++;
				}
			}

			if (a != 0 || b >= 0) {
				System.out.println("Answer is: " + c);
			}

			System.out.println("Do you want to repeat?");
			p = scan.nextBoolean();

		}
	}
}
