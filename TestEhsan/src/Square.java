
public class Square {

	public Square() {// default constructor
	}

	public Square(double len) {// used in initializing object member
		this.length = len;
	}

	private double length;

	public double getLength() {// to get value of object member
		return length;
	}

	public void setLength(double length) {/*
											 * to set a certain value to object
											 * member and encapsulate it
											 */
		if (length < 20 && length != 0)
			this.length = length;
	}

	public double surface() {
		// body of method
		return length * length;
	}

	public double area() {
		return 4 * length;
	}

	public void printInfo(boolean byDetail) {

		System.out.println("lenght is " + length);

		if (byDetail)
			System.out.println("by detail is true");
	}

}
