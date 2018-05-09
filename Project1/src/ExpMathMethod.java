public class ExpMathMethod {
	public static void main(String[] args) {

		// A = P (1+R)^N
		// formula of amount of something with initial amount of P and rate of
		// increase or decrease R in N steps that:
		// A = Amount
		// P = Principal
		// R = Rate
		// N = Number exp:Day

		double a;
		double p = 100; // amount of members
		double r = 0.01;// rate of increase members

		for (int day = 1; day <= 30; day++) {
			a = p * Math.pow(1 + r, day);
			System.out.println(day + " " + a);
		}
	}
}
