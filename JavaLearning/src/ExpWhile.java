import java.util.Scanner;

public class ExpWhile {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int total = 0;
		int grade;
		int average;
		int counter = 0;

		System.out.println("How many grade wish to Average?");
		int i = scan.nextInt();
		System.out.println("please Enter " + i + " grades:");

		while (counter < i) {
			grade = scan.nextInt();
			total += grade;
			counter++;
		}
		average = total / i;
		System.out.println("Your is Average is:" + average);
	}
}
