package bus_station;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Buffer {
	private int last_Passenger_Code;
	private Path filePath;
	private Directory dir;
	private String url;

	public Buffer() {
		filePath = Paths.get("src\\bus_station\\BUFFER.BUF");
		dir = new Directory(filePath);
		url = dir.getCombinedPath();
	}

	// method
	protected void write(int lPC) {
		this.last_Passenger_Code = lPC;
		try {
			File wFile = new File(url);
			if (!wFile.exists()) {
				wFile.createNewFile();
				System.out.println("creating Buffer file...");
			} else {
				System.out.println("Updating Buffer file...");
			}
			BufferedWriter wBuffer = new BufferedWriter(new FileWriter(wFile));
			wBuffer.write(String.format("%d", lPC));
			wBuffer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected Object read() {
		try {
			File rFile = new File(url);
			if (rFile.exists()) {
				BufferedReader rBuffer = new BufferedReader(new FileReader(
						rFile));
				this.last_Passenger_Code = Integer.parseInt(rBuffer.readLine());
				rBuffer.close();
			} else {
				this.last_Passenger_Code = 1;
			}
			return last_Passenger_Code;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getLast_Passenger_Code() {
		return last_Passenger_Code;
	}

	public Directory getDir() {
		return dir;
	}

	public void setDir(Directory dir) {
		this.dir = dir;
	}

	public Path getFilePath() {
		return filePath;
	}

	public void setFilePath(Path filePath) {
		this.filePath = filePath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
