package intermidiateJava;

//Lesson18: Thread means multiTasking

import java.util.Random;

//for thread need to "implement" child class to parent "runnable" and add "run method"
public class Thread_Exp implements Runnable {

	String name;
	int time;
	Random r = new Random();

	// constructor
	public Thread_Exp(String name) {
		this.name = name;
		time = r.nextInt(999); // convert r to integer with bound(milli second)
	}

	// "Run" method
	@Override
	public void run() {
		// "run" wants our programs here
		// use try/catch for errors
		try {
			System.out.printf("%s is sleeping for %d ms\n", name, time);
			// %s fill with string and %d fill with number
			Thread.sleep(time); // "Thread" keep all programs here and decide
			System.out.printf("%s is waked up\n", name);

		} catch (Exception e) { // InterrupedException
			System.err.println(e);
		}
	}
}
