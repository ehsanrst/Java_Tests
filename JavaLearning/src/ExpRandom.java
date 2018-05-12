import java.util.Random;

public class ExpRandom {
	public static void main(String[] args) {

		Random rand = new Random();
		int number;

		for (int i = 1; i <= 10; i++) {
			number = 1 + rand.nextInt(6); /*
										 * with (1+) it will gave you num
										 * between 1~6 cause computer count from
										 * zero
										 */
			System.out.println(number + " ");
		}

	}
}
