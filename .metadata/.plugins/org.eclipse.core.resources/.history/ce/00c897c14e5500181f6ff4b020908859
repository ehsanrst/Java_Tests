package primeter;

import java.util.Scanner;

public class TestCode {
	public static void main(String[] args) {
		double a, b, c, r;
		Scanner scan = new Scanner(System.in);
		System.out
				.println("\"Primeter Program\"\nWhat your shape?\n1.trianglular\t2.square\n3.rectangular\t4.circle\nEnter number:");
		int num = scan.nextInt();

		switch (num) {
		case 1:
			System.out.println("Enter first side length:");
			a = scan.nextDouble();
			System.out.println("Enter second side length:");
			b = scan.nextDouble();
			System.out.println("Enter third side length:");
			c = scan.nextDouble();
			Perimeter pT = new Triangular(a, b, c);
			System.out.println("Primeter for Triangular is: " + pT.primeter());
			break;
		case 2:
			System.out.println("Enter side length:");
			a = scan.nextDouble();
			Perimeter pS = new Square(a);
			System.out.println("Primeter for Square is: " + pS.primeter());
			break;
		case 3:
			System.out.println("Enter first side length:");
			a = scan.nextDouble();
			System.out.println("Enter second side length:");
			b = scan.nextDouble();
			Perimeter pR = new Rectangular(a, b);
			System.out.println("Primeter for Rectangular is: " + pR.primeter());
			break;
		case 4:
			System.out.println("Enter radius:");
			r = scan.nextDouble();
			Perimeter pC = new Circle(r);
			System.out.println("Primeter for Circle is: " + pC.primeter());
			break;
		}
	}
}
