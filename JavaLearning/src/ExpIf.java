public class ExpIf {
	public static void main(String[] args) {

		int t = 7;
		if (t == 9) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		String b = (t == 9) ? "Yes" : "No";
		System.out.println(b);
	}
}
