import java.util.Scanner;

public class NumberToText {

	public static void main(String[] args) {

		boolean p = true;

		while (p) {

			double aa = 0.0;
			int a = 0, b = 0, c = 0, d = 0;
			String as = null, bs = null, cs = null;

			AlphabetNum alNum = new AlphabetNum();
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter an integer number between 0 to 1000 :");
			aa = scan.nextDouble();
			a = (int) aa;
			if (a < 1000 && a > 0) {
				while (a % 10 != 0) {
					a--;
					b++;
				}
				while (a % 100 != 0) {
					a--;
					c++;
				}
				if (a != 0) {
					alNum.seteNum(a);
					as = alNum.alphabet();
				}

				if ((c + b) < 20 && (c + b) > 10) {
					c = c + b;
					alNum.seteNum(c);
					cs = alNum.alphabet();
					b = 0;
					d = c;
				} else {
					alNum.seteNum(b);
					bs = alNum.alphabet();
					alNum.seteNum(c);
					cs = alNum.alphabet();
					d = 0;
				}
				if (a == 0 && c == 0) {
					System.out.println(bs);
				} else if (a == 0 && d != 0) {
					System.out.println(cs);
				} else if (a == 0 && d == 0) {
					System.out.println(cs + "o " + bs);
				} else if (c == 0 && b == 0) {
					System.out.println(as);
				} else if (b == 0) {
					System.out.println(as + "o " + cs);
				} else if (c == 0) {
					System.out.println(as + "o " + bs);
				} else {
					System.out.println(as + "o " + cs + "o " + bs);
				}

			} else {
				System.out.println("Entered number is out of range");
			}
			if (aa > (int) aa) {
				System.out.println("(values ​​after the decimal are ignored)");
			}
			System.out.println("Do you want to try once more? (true/false)");
			p = scan.nextBoolean();
		}
	}

}
