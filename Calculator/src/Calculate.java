//In the name of Allah
public class Calculate {

	private double eNum;
	private double eNum2;

	// private double eNum3;// Not necessary!!!!

	public Calculate() {
	}

	public double geteNum() {
		return eNum;
	}

	public void seteNum(double eNum) {
		this.eNum = eNum;
	}

	public double geteNum2() {
		return eNum2;
	}

	public void seteNum2(double eNum2) {
		this.eNum2 = eNum2;
	}

	public double sumation() {
		return eNum + eNum2;
	}

	public double subtraction() {
		return eNum - eNum2;
	}

	public double multiplication() {
		return eNum * eNum2;
	}

	public double division() {
		double eNum3 = 0;
		if (eNum2 == 0) {
			System.out.println("Division is infinity");
			eNum3 = 0.0;
		} else {
			eNum3 = eNum / eNum2;
		}
		return eNum3;
	}

	public double remaining() {
		return eNum % eNum2;
	}

	public double area() {

		double eNum3 = 2 * (eNum + eNum2);
		if (eNum <= 0 || eNum2 <= 0) {
			System.out.println("area Unknwon");
		}
		return eNum3;
	}

	public double power() {
		double eNum3 = 0;
		if (eNum2 == 0) {
			eNum3 = 1;
		} else if (eNum2 > 0) {
			eNum3 = 1;
			while (eNum2 != 0) {
				eNum3 = eNum3 * eNum;
				eNum2--;
			}
		} else if (eNum2 < 0) {
			eNum3 = 1;
			while (eNum2 != 0) {
				if (eNum == 0) {
					System.out.println("Power is infinity.");
					eNum3 = 0.0;
					break;
				}

				eNum3 = eNum3 * (1 / eNum);
				eNum2++;
			}
		}

		return eNum3;

	}
}
