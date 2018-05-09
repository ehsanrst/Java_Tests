import java.util.Scanner;

public class NumToText {

	public static void main(String[] args) {
		boolean p = true;
		AlphabetNum alNum = new AlphabetNum();
		Scanner scan = new Scanner(System.in);

		while (p) {
			// double aa = 0.0;
			// int a = 0, b = 0, c = 0;
			// String as = null, bs = null, cs = null;

			System.out
					.println("Enter an integer three-digit-number between 100 to 999 :");
			int num = scan.nextInt();
			String numToAlphabet = "";
			numToAlphabet = alNum.alphabet(num / 100, 3);

			if (num % 100 > 10 && num % 100 < 20) {
				numToAlphabet += (" o " + alNum.alphabet(num % 100));
			} else {
				num = num % 100;
				if (num / 10 != 0)
					numToAlphabet += (" o " + alNum.alphabet(num / 10, 2));

				num = num % 10;
				if (num != 0)
					numToAlphabet += (" o " + alNum.alphabet(num, 1));
			}
			System.out.println(numToAlphabet);

			// while (num > 0) {
			// rev = rev * 10 + (num % 10);
			// num /= 10;
			// }
			// a = (int) aa / 100;
			// a = a * 100;
			// c = (int) (aa % 100) / 10;
			// c = c * 10;
			// b = (int) ((aa % 100) % 10);
			//
			// alNum.seteNum(a);
			// as = alNum.alphabet();
			//
			// if ((c + b) < 20 && (c + b) > 10) {
			// c = c + b;
			// alNum.seteNum(c);
			// cs = alNum.alphabet();
			// b = 0;
			// } else {
			// alNum.seteNum(b);
			// bs = alNum.alphabet();
			// alNum.seteNum(c);
			// cs = alNum.alphabet();
			// }
			//
			// if (c == 0 && b == 0) {
			// System.out.println(as);
			// } else if (b == 0) {
			// System.out.println(as + "o " + cs);
			// } else if (c == 0) {
			// System.out.println(as + "o " + bs);
			// } else {
			// System.out.println(as + "o " + cs + "o " + bs);
			// }
			System.out.println("Do you want to try once more? (true/false)");
			p = scan.nextBoolean();
		}
	}
}