package intermidiateJava;

//Lesson8: Collections.sort that sort alphabetical

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	public static void main(String[] args) {

		String[] array = { "Ehsan", "Mohammad", "Hossein", "Abbas", "Ahmad" };
		List<String> l1 = Arrays.asList(array); // Convert array to List

		Collections.sort(l1); // sort items alphabetical
		System.out.println(" " + l1);

		// Collections.reverse(l1); // reverse sort
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(" " + l1);

	}
}
