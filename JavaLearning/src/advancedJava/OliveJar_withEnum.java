package advancedJava;

import java.util.ArrayList;

public class OliveJar_withEnum {

	public ArrayList<Olive_withEnum> olives;

	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive_withEnum(OliveName_Enum.GOLDEN, 0xDA9100));
	}

	public OliveJar_withEnum() {
		System.out.println("Constructor...");
	}

	public OliveJar_withEnum(int nOlive, OliveName_Enum oliveName, long color) {
		for (int i = 0; i < nOlive; i++) {
			olives.add(new Olive_withEnum(oliveName, color));
		}
	}

	// methods
	public void addOlive(OliveName_Enum oliveName, long color) {
		olives.add(new Olive_withEnum(oliveName, color));
	}

	public void reportOlives() {

		/* Inner_Local_Class: Class in method */
		class JarLid { // it's Private by itself
			public void open() {
				System.out.println("Go");
				System.out.println("wait!");
			}
		}
		new JarLid().open(); // use class (new constructor.method)
		/* end */

		/* Unknown_Inner_Local_Class: Object class */
		new Object() {// Object class exist in java
			public void open() {
				System.out.println("Go");
				System.out.println("wait!");
			}
		}.open();// open object class
		/* end */

		for (Olive_withEnum o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!");
		}
	}
}