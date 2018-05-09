import java.util.Scanner;

public class ExpMethod {
	public static void main(String[] args) {

		sum();
	}

	public static void sum() {
		Scanner scan = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter the first num: ");
		fnum = scan.nextDouble();
		System.out.println("Enter the secound num: ");
		snum = scan.nextDouble();
		answer = fnum + snum;
		System.out.println("Answer is: " + answer);
	}
}
