package primeter;

//subclass
public class Triangular extends Perimeter {
	private double a, b, c, p;

	// constructor
	public Triangular(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// methods
	@Override
	public double primeter() {
		p = a + b + c;
		return p;
	}

	// setter and getter
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
