import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Codegate team. Visit Codegate.ir
// ©CodeGate 2016

public class TestWriteTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("D:\\write file.txt");
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("creating new file");
			}else{
				System.out.println("updating file");
				
			}
			BufferedWriter buffer = new BufferedWriter(new FileWriter(file));
			buffer.write("hello");
			buffer.close();
			System.out.println("finish writing to file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
