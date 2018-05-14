package intermidiateJava;

//Lesson11: Stack

import java.util.Stack;

public class Stack_Exp {
	public static void main(String[] args) {
		// create a stack
		Stack<String> stack = new Stack<String>();
		// OR: Stack<String> stack = new Stack();

		stack.push("First"); // ".push" to add something to stack
		printStack(stack); // we will build this method
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);

		stack.pop(); // ".pop" to delete items from "end of stack"
		printStack(stack);
		stack.pop(); // delete second item
		printStack(stack);
		stack.pop(); // delete third item
		printStack(stack);
	}

	// build printStack method
	private static void printStack(Stack<String> st) {
		if (st.isEmpty()) {
			System.out.println("\nstack is Empty!");
		} else {
			System.out.print(" " + st);
		}
	}

}
