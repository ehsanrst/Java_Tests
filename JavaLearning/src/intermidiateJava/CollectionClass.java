package intermidiateJava;

//Lesson5 :compare two list and print list1-list2

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionClass {
	public static void main(String[] args) {
		// make list 1
		String things[] = { "egg", "apple", "orange", "hat", "pen", "book",
				"ruler" };
		// use List interface
		List<String> list1 = new ArrayList<String>(); // PolymorPhism

		// add array items to the list one by one
		for (String x : things) {
			list1.add(x);
		}
		// make list 2
		String moreThings[] = { "apple", "hat" };
		List<String> list2 = new ArrayList<String>();
		for (String y : moreThings) {
			list2.add(y);
		}

		/*
		 * use editList method and let java build it's method + but we need to
		 * change parameters and change types from List<> to Collection<>
		 */
		editList(list1, list2);
		System.out.println();

		// print list 1
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(" " + list1.get(i)); // "print" shows in one line
		}
	}

	// make editList that operate "List-List2"
	/*
	 * method of editList with two parameter by type of Collection to Collect
	 * list1 and list2 into method
	 */
	private static void editList(Collection<String> l1, Collection<String> l2) {
		/*
		 * iterator goes to list and check values one by one and give them to
		 * "it" continuously, and we just iterate one list here
		 */
		Iterator<String> it = l1.iterator();

		// while list "has Next" items to check
		while (it.hasNext()) {
			// if list2 contains this "next item" of "it" delete it
			if (l2.contains(it.next())) {
				it.remove();
			}
		}
	}
}
