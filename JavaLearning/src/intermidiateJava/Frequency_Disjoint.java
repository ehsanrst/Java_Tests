package intermidiateJava;

//lesson10: Frequency and Disjoint

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency_Disjoint {
	public static void main(String[] args) {

		String[] array = { "ehsan", "mohammad", "saeed", "sajad", "mohammad" };
		List<String> list1 = Arrays.asList(array);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("yasser");
		list2.add("mohammad");
		list2.add("babak");
		Collections.addAll(list2, array);

		System.out.println();
		for (String x : list2)
			System.out.print(" " + x);

		// Frequency------------------------
		/* means how many times an item repeated to a list */
		System.out.println("\n 'Mohammad' frequent: "
				+ Collections.frequency(list2, "mohammad") + " times");
		// .frequency(where, what)

		// Disjoint--------------------------
		/* means check that two list are the same or not */
		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof);

		if (tof) {
			System.out.println("lists are same");
		} else {
			System.out.println("Lists are not same");
		}
	}
}