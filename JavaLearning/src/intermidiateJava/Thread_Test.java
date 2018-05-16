package intermidiateJava;

//Lesson18

public class Thread_Test {
	public static void main(String[] args) {
		/* the programs (multi programs) */
		Runnable r1 = new Thread_Exp("First thread"); // polymotPhism
		// first Class with it's initial, Thread accept runnable parameter
		Thread t1 = new Thread(r1);
		// second Class
		Thread t2 = new Thread(new Thread_Exp("Second thread"));
		// third Class
		Thread t3 = new Thread(new Thread_Exp("Third thread"));
		// forth Class
		Thread t4 = new Thread(new Thread_Exp("Forth thread"));
		/* they go to sleep together */

		/* but start again with "Thread's decide" */
		// type who wake up here
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/* normally who sleep less starts sooner */
	}
}
