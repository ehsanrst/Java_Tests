package intermidiateJava;

//Lesson 13: Set and hashSet

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Exp {
	public static void main(String[] args) {

		// SET: is a collection with not contain same element twice

		String[] things = { "apple", "orange", "pie", "meat", "pie" };
		List<String> list = Arrays.asList(things); // convert to list

		System.out.print(" " + list + "\n");

		// make SET: with child "HashSet"
		Set<String> set = new HashSet<String>(list);
		// this will take "list" only (not Array) and "delete" duplicate items
		System.out.printf("%s", set);

		// in java7 we can
		int a = 1000000000;
		// this equals to this one
		int b = 1_000_000_000;
		// to read more easily

	}
}
