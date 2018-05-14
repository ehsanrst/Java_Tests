package intermidiateJava;

//Lesson6: "Linked List" method of "List<>"

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Class {
	public static void main(String[] args) {
		// First list-------------
		String things[] = { "apple", "orange", "peach", "pineapple", "pear" };
		List<String> list1 = new LinkedList<String>(); // PolymorPhism

		for (String x : things) {
			list1.add(x);
		}
		// Second list------------
		String things2[] = { "sausage", "Sheep", "goat", "snow", "Flower" };
		List<String> list2 = new LinkedList<String>();

		for (String y : things2) {
			list2.add(y);
		}
		// with Linked List we can:
		// "add ALL" items of list2 in list1
		list1.addAll(list2);
		// and make list2 empty
		list2 = null;

		// make some methods
		printMe(list1);
		removeStuff(list1, 2, 4);// remove item 2 to 4
		printMe(list1);
		reverseMe(list1);
	}

	// Outside of main method
	private static void printMe(List<String> l) {
		for (String b : l) {
			System.out.print(" " + b);
		}
		System.out.println("\n"); // empty line
	}

	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear();
		// make an "subList" that wish to remove and "Clear"
	}

	private static void reverseMe(List<String> l) {
		// ListIterator: to copy items of one List in another List
		ListIterator<String> m = l.listIterator(l.size());

		// while list "has Previous" items to check
		while (m.hasPrevious()) {
			System.out.print(" " + m.previous()); // opposite of ".Next()"
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
	 * "l.subList(from,to)" make smaller list of l_list from one item to another
	 * and doing some operation on it like "clear()"
	 */
}
