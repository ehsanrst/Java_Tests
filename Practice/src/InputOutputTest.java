import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputTest {

	public static void main(String[] args) {

		FileInputStream input = null;
		FileOutputStream output = null;

		try {

			input = new FileInputStream(
					"C:\\Users\\Ehsan\\Downloads\\christiane.jpg");
			output = new FileOutputStream("D:\\1.jpg");

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
