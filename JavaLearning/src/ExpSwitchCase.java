public class ExpSwitchCase {
	public static void main(String[] args) {

		int age = 3;
		switch (age) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Bigger than Three");
			break; //Not really necessary.
		}
	}
}
