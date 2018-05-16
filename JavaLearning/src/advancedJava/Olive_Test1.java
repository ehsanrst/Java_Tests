package advancedJava;

import java.util.ArrayList;
import java.util.Random;

public class Olive_Test1 {
	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);

		ArrayList<Olive> list = new ArrayList<Olive>();// arrayList

		list.add(o1);
		list.add(o2);
		list.add(o3);

		Random generator = new Random();
		int index = generator.nextInt(3);
		System.out.println("Random value: " + index);

		Olive o = list.get(index);

		switch (o.oliveName) {
		case "Kalamata":
			System.out.println("It's Greek!");
			break;
		case "Picholine":
			System.out.println("It's French!");
			break;
		case "Ligurio":
			System.out.println("It's Italian!");
			break;
		default:
			System.out.println("It's Iranian!");
		}

	}
}
