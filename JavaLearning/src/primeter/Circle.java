package primeter;

//subclass
public class Circle extends Perimeter {

	private double r, p;

	// constructor
	public Circle(double r) {
		this.r = r;
	}

	// methods
	@Override
	public double primeter() {
		p = 2 * Math.PI * r;
		return p;
	}

	// setter and getter
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
