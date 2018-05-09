import java.util.Scanner;

public class Arrange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of your array:");
		int n = scan.nextInt();
		double[] nums = new double[n];
		for (int idx = 0; idx < n; idx++) {
			System.out.println("Enter nums" + (idx + 1));
			nums[idx] = scan.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			double d = nums[i];
			for (int j = i + 1; j < n; j++) {
				if (d < nums[j]) {
					d = nums[j];
					nums[j] = nums[i];
					nums[i] = d;
				}
			}
		}
		System.out.println("Array arranged Decreasing:");
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
