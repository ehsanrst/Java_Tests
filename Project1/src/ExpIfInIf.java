public class ExpIfInIf {
	public static void main(String[] args) {

		int age = 32;

		if (age >= 60) {
			System.out.println("you are old");
		} else if (age >= 50) {
			System.out.println("you are in your 50th");
		} else {
			if (age >= 30) {
				System.out.println("you are in your 30th");
			} else {
				System.out.println("you are too young");
			}
		}
	}
}
