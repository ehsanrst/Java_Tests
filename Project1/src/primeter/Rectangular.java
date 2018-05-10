package primeter;

//subclass
public class Rectangular extends Perimeter {
	private double a, b, p;

	// constructor
	public Rectangular(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// methods
	@Override
	public double primeter() {
		p = a + b;
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
}
