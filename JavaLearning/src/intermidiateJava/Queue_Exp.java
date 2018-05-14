package intermidiateJava;

//Lesson12: Queue  !!!problem in consequence!!!

import java.util.PriorityQueue;

public class Queue_Exp {
	public static void main(String[] args) {
		// make a Queue
		PriorityQueue<String> q = new PriorityQueue<String>();

		q.offer("First"); // ".offer()" add something to Queue
		q.offer("second"); // with 2th "priority"
		q.offer("Third"); // with 3th "priority"
		System.out.print(" " + q);
		System.out.println();

		// PEEK method: will give you item with "higher priority"
		System.out.print(" " + q.peek() + "\n");
		;

		// Remove the HEAD of Queue
		q.poll(); // ".poll" to delete head item from queue
		System.out.print(" " + q + "\n");
		q.poll();
		System.out.printf("%s", q);

	}
}
