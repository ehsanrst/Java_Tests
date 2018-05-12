//Reader and Writer and exceptions errors with "throws"

import java.io.BufferedReader;
import java.io.FileReader;

public class ExpExceptionThrows {
	// main method with throws to know and show errors
	public static void main(String[] args) throws Throwable {

		FileReader fr = new FileReader("text.txt"); // Reader
		BufferedReader br = new BufferedReader(fr); // Buffer

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println("Read: " + line);
		}
		/*
		 * OR: while (br.readLine() != null) { System.out.println("Read: " +
		 * br.readLine()); }
		 */
	}
}
