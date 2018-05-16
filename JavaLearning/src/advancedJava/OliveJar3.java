package advancedJava;

//Test3 :With Non_Static{} initializer
import java.util.ArrayList;

public class OliveJar3 {
	// Non_static Array
	public ArrayList<Olive> olives;

	// Non_static_init
	{
		System.out.println("initializing...");// SECOND (add)
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0x000000));
		olives.add(new Olive("Picholine", 0x00FF00));
		olives.add(new Olive("Parvardeh", 0x000000));
	}

	// constructor
	public OliveJar3() {
		System.out.println("Constructor1");
	}

	public OliveJar3(int nOlive, String oliveName, long color) {
		System.out.println("Constructor2");// THIRD (add)
		for (int i = 0; i < nOlive; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

}