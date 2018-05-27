package advancedJava;

//Test2 :With Static{} initializer
import java.util.ArrayList;

public class OliveJar2 {
	// build array list from Olive class
	public static ArrayList<Olive> olives;

	/*
	 * ATTENTION: everything type in "static{}" will run before main_Class's
	 * constructors after main_method of class that called
	 */
	static {
		// second, static will run, and use constructor for running
		System.out.println("initializing...");
		olives = new ArrayList<>();
		// this olives will add values to variable in main_method
		olives.add(new Olive("Kalamata", 0x000000));
		olives.add(new Olive("Picholine", 0x00FF00));
		olives.add(new Olive("Parvardeh", 0x000000));

	}

}
