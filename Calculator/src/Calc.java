import java.util.Scanner;

//In the name of Allah
public class Calc {

	public static void main(String[] args) {

		double doubleNum1 = 0.0;
		double doubleNum2 = 0.0;
		double Sum = 0.0;
		double Sbt = 0.0;
		String Str = "Hello! This program will help you to sum or subtraction two number";

		System.out.println(Str);
		System.out.println("Please Enter First Number");

		Scanner sc1 = new Scanner(System.in);
		doubleNum1 = sc1.nextDouble();

		System.out.println("Great, Now Enter Second Number");

		Scanner sc2 = new Scanner(System.in);
		doubleNum2 = sc2.nextDouble();

		Sum = doubleNum1 + doubleNum2;
		Sbt = doubleNum1 - doubleNum2;

		System.out.println("Summation=" + Sum);
		System.out.println("Subtraction=" + Sbt);

	}
}
