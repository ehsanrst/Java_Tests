package com.main;
import java.util.Scanner;

public class Avrage {

	public static void main(String[] args) {
		double[] score = new double[3];

		// double[] score = { 2, 3, 6, 96, 4, 7, 474, 66 };

		double avrage = 0.0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter score1: ");
		score[0] = scan.nextDouble();
		System.out.println("Enter score2: ");
		score[1] = scan.nextDouble();
		System.out.println("Enter score3: ");
		score[2] = scan.nextDouble();
		for (int idx = 0; idx < score.length; idx++) {
			avrage += score[idx];
		}
		System.out.println("Avrage is: " + (avrage / score.length));
	}
}
