package intermidiateJava;

//lesson10: .addAll

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_AddAll {
	public static void main(String[] args) {

		String[] array = { "ehsan", "mohammad", "saeed", "sajad", "davood" };
		List<String> list1 = Arrays.asList(array);// convert to List<>

		/*
		 * ATTENTION: ArrayList<> can be change (different from List<>); means
		 * no need to convert "Array"s to able to CONTACT with "ArrayList<>"s
		 */
		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("yasser");
		list2.add("navid");
		list2.add("babak");

		for (String x : list2) {
			System.out.print(" " + x);
		}
		// "addAll"
		Collections.addAll(list2, array); // .addAll(to, from)
		System.out.println();
		for (String x : list2) {
			System.out.print(" " + x);
		}
	}
}
