import java.util.EnumSet;

public class ExpEnum1 {
	public static void main(String[] args) {

		// Enum1 is the type of variable "people" here

		// for (Enum1 people : Enum1.values()) {
		// // enhanced for loop
		// System.out.println(people + "\t" + people.getDesc() + "\t"
		// + people.getYear());
		// }

		/*
		 * "Enum1 people" is an Constant in this Class that fill with member's
		 * of "Enum1.values()" in each loop
		 */

		for (Enum1 people : EnumSet.range(Enum1.Mohamad, Enum1.Ali)) {
			// use EnumSet for set special works on enum like .range
			System.out.println(people + "\t" + people.getDesc() + "\t"
					+ people.getYear());
		}
		// System.out.println(Enum1.Ehsan.getDesc());
	}
}
