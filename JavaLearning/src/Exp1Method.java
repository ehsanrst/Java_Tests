public class Exp1Method {

	// first lesson ===========================
	public void method() {
		System.out.println("this is first method");
	}

	public void method2() {
		System.out.println("this is secound method");
	}

	// Second lesson ===========================
	public void simpleMessage(String name) {
		System.out.println("Hello " + name);
	}

	// third lesson ===========================
	private String girlName; // just known here

	public String getGirlName() { // method that return name
		return girlName;
	}

	public void setGirlName(String girlName) { // or: (String name)
		this.girlName = girlName; // or: girlName=name;
	} // used 'this' because both is same name

	public void sayingG() {
		System.out.println("She's name is \n" + getGirlName());
	}

	// 4th lesson ===========================
	private String boyName;

	public String getBoyName() {
		return boyName;
	}

	public Exp1Method() { // Constructor must have same name with Class
		// common constructor No initial
	}

	public Exp1Method(String name) { // constructor with initial
		boyName = name; // No more need setter with this constructor
	}

	public void sayingB() {
		System.out.println("He's name is \n" + getBoyName());
	}
}
