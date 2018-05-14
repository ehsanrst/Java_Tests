package intermidiateJava;

//Lesson9:Reverse and Copy and Fill

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCopyFill {
	public static void main(String[] args) {

		Character[] chars = { 'a', 'b', 'c', 'd', 'f' };
		List<Character> l = Arrays.asList(chars);

		System.out.println("List is: ");
		output(l); // output method we made to print

		// Reverse and print the List
		Collections.reverse(l);
		System.out.println("After Reverse: ");
		output(l);

		// Create a new Array and a new List
		Character[] newChars = new Character[chars.length];
		List<Character> lCopy = Arrays.asList(newChars);

		// Copy content of "l" to "lCopy"
		Collections.copy(lCopy, l); // .copy(to, from)
		System.out.println("Copy of List: ");
		output(lCopy);

		// Fill Collections
		Collections.fill(l, 'A'); // .fill(what, with)
		System.out.println("Fill Collection");
		output(l);
	}

	// build method of print
	private static void output(List<Character> list) {
		for (Character x : list) {
			System.out.print(" " + x);
		}
		System.out.println();
	}
}
