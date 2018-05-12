//Reader and Writer and exceptions errors with "try/catch"

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpExceptionTryCatch {
	public static void main(String[] args) {
		// add try/catch around code
		try {
			FileReader fr = new FileReader("text.txt"); // Reader
			BufferedReader br = new BufferedReader(fr); // Buffer

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("Read: " + line);
			}
		} catch (Exception e) {
			System.err.println(e); // print error "err"
		}
	}
}
