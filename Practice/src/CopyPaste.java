import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyPaste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileInputStream input = null;
		FileOutputStream output = null;
		String pthC = null;
		String pthP = null;
		System.out.println("*Copy file from one Dir to another*");
		System.out.println("Enter the path of file (Dir\\filename.file ext):");
		pthC = scan.next();
		System.out
				.println("Where is the path to paste? (Dir\\filename.file ext)");
		pthP = scan.next();

		try {

			input = new FileInputStream(pthC);
			output = new FileOutputStream(pthP);

			int c;
			while ((c = input.read()) != -1) {

				output.write(c);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
