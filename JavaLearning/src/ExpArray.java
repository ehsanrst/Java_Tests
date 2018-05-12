import java.util.Random;

import javax.swing.JOptionPane;

public class ExpArray {
	public static void main(String[] args) {
		// lesson one-----------------------
		// int a[] = new int[3];
		// a[0] = 87;
		// a[1] = 25;
		// a[2] = 48;
		// // and better way is:
		// int b[] = { 2, 3, 4, 5, 6, 7 };
		// System.out.println(b[2]);

		// lesson two-----------------------
		// System.out.println("index\tvalue"); // (\t) make 5 space
		// int ar1[] = { 32, 18, 12, 54, 2, 4 };

		// for (int i = 0; i < ar1.length; i++) {
		// System.out.println(i + "\t" + ar1[i]);
		// }

		// lesson three---------------------
		// int ary2[] = { 21, 16, 86, 21, 3 };
		// int sum = 0;

		// for (int i = 0; i < ary2.length; i++) {
		// sum += ary2[i];
		// }
		// System.out.println("sum= " + sum);
		// JOptionPane.showMessageDialog(null, "Sum is: " + sum); // box massage

		// lesson four-----------------------
		// a prog that show in turning a Tass 1000times each face how many times
		// will be show up
		Random rand = new Random();
		int freq[] = new int[7];

		for (int rull = 1; rull <= 1000; rull++) {
			++freq[1 + rand.nextInt(6)]; // this plus 1 times to each random
											// array num
		}
		System.out.println("face\tfrequency");
		for (int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);

		}

	}
}
