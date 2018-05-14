package intermidiateJava;

//Lesson7: convert array and list

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		// Converting Array to List------------
		String[] stuff = { "pen", "paper", "rubber", "pencil" };
		LinkedList<String> theList = new LinkedList<String>(
				Arrays.asList(stuff));
		// OR: List<String> theList=Arrays.asList(stuff);

		/*
		 * "Arrays.asList(array's name)" is an inner method inside PARENT of
		 * LinkedList<> (Collections) that convert "Array" to "List<>"
		 */
		theList.add("marker"); // "add" item to list
		theList.addFirst("board"); // "add" item to "First" of list

		// Converting List to Array-------------
		stuff = theList.toArray(new String[theList.size()]);

		for (String x : stuff) {
			System.out.print(" " + x);
		}
	}
}
