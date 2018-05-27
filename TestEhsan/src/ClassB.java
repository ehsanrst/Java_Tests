import java.util.UUID;

public class ClassB extends ClassA implements TestInterface {

	public ClassB() {
		super("");
	}

	@Override
	public String callMe() {
		String t = super.name;

		return "class b-- > from me!!";
	}

	@Override
	public void print() {
		System.out.println(UUID.randomUUID().toString());

	}

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
