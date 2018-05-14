package intermidiateJava;

//Lesson5 :compare two list and print list1-list2

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection_Class {
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

		// make a method
		editList(list1, list2);
		System.out.println();

		// print list 1
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(" " + list1.get(i)); // "print" shows in one line
		}
	}

	// make editList method with two parameter list1 and list2 into method
	// Collection is parent of List
	private static void editList(Collection<String> l1, Collection<String> l2) {
		// Iterator: to copy items of one collection in another collection
		/*
		 * iterator goes to Collection and check values one by one and give them
		 * to Another continuously, and we just iterate one list here
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
	/*
	 * ATTENTION: "Collection" is the 'root interface' to the java Collections
	 * hierarchy. "List" is one 'sub interface' which defines an ordered
	 * Collection, "Queue" is one 'sub interfaces' which typically will store
	 * elements ready for processing, "set" is one 'sub interfaces' which adds
	 * the feature that it will never contain the same element twice.
	 */

	/*
	 * A "List" adds the information about a defined sequence of stuff to it:
	 * You can get the element at position n, you can add an element at position
	 * n, you can remove the element at position n
	 */
}
