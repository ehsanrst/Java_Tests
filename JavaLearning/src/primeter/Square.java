package primeter;

//subclass
public class Square extends Perimeter {

	private double a, p;

	// constructor
	public Square(double a) {
		this.a = a;
	}

	// methods
	@Override
	public double primeter() {
		p = 4 * a;
		return p;
	}

	// setter and getter
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}
