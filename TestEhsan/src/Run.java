import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Run {

	public static void main(String[] args) {

		int[] intArray = new int[10];

		List<Integer> intList = new ArrayList<>();
		intList.add(10);

		// Map<Integer, ClassB> keyValueMap = new HashMap<Integer, ClassB>();
		// keyValueMap.put(1, new ClassB(21236,5665465,":dsfds"));
		// keyValueMap.put(2, "khubi?");

		// Map<Integer, String> keyValueMap = new LinkedHashMap<Integer,
		// String>();

		Map<Integer, String> keyValueMap = new HashMap<Integer, String>();

		keyValueMap.put(1, "Salam");
		keyValueMap.put(2, "khubi?");

		System.out.println(keyValueMap.get(1));

		keyValueMap.keySet();
		keyValueMap.values();

		for (Integer key : keyValueMap.keySet()) {
			System.out.println(keyValueMap.get(key));
			if (key.equals(2))
				keyValueMap.put(key, "manamkhubam");
		}

		List<Integer> keyList = new ArrayList<Integer>();
		List<String> valueList = new ArrayList<String>();

		keyList.add(2);
		valueList.add("khubi");

		keyList.add(1);
		valueList.add("salam");

		for (int i = 0; i < keyList.size(); i++) {
			if (keyList.get(i).equals(1))
				System.out.println(valueList.get(i));
		}

		//
		// ClassB b = new ClassB();
		// // System.out.println(b.callMe());
		//
		// TestInterface testInterface = new ClassB();
		// // exp: "List" is an Interface
		// List<String> l1 = new ArrayList<>();
		// List<String> l11 = new LinkedList<>();
		//
		// testInterface.print();
		//
		// ClassB b1 = new ClassB();
		// /* "b1" can access all of ClassB methods */
		// ClassA a2 = new ClassB();
		// /*
		// * "a2" can access all of methods of ClassB that are exist in ClassA
		// * (ClassA is shablon)
		// */
		//
		// TestInterface t1 = new ClassB();
		// /*
		// * we can't create object from an Interface because method of
		// Interface
		// * have not body and they actually doesn't exist then we create object
		// * of interface with constructor of Class that implement to this
		// * interface, (Class make interface exist)
		// */
		//
		// ClassB b3 = (ClassB) a2; // Casting
		// /*
		// * when we want to "a2" can access to all method of ClassB we must
		// * "CAST" it to another object by type of ClassB
		// */
	}
}
