import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		boolean p = true;
		Scanner scan = new Scanner(System.in);
		while (p) {
			double aa = 0.0;
			int a = 0, b = 0, c = 0, d = 0;

			System.out
					.println("Enter an integer three-digit-number between 100 to 999 :");
			aa = scan.nextDouble();
			a = (int) aa / 100;
			c = (int) (aa % 100) / 10;
			c = c * 10;
			b = (int) ((aa % 100) % 10);
			b = b * 100;
			d = a + c + b;
			System.out.println("Reverse: " + d);
			System.out.println("Do you want to try once more? (true/false)");
			p = scan.nextBoolean();

			// int num = 3456;
			// int rev = 0;
			// while (num > 0) {
			// rev = rev * 10 + (num % 10);
			// num /= 10;
			// }
		}
	}
}
