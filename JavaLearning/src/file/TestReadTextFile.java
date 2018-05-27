import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Codegate team. Visit Codegate.ir
// ©CodeGate 2016

public class TestReadTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("D:\\read file.txt");
			if (file.exists()) {
				System.out.println("****** Reading file ... ******");
				BufferedReader buffer = new BufferedReader(new FileReader(file));
				String line;
				while ((line = buffer.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println("****** Finish Reading file ******");
			}else{
				System.out.println(file.getAbsolutePath()+" not exist");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
