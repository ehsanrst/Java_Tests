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
import java.util.LinkedHashMap;
import java.util.Map;

//to build/update "APP.CONF" file
public class Bus_Line_Info {
	private int line_Code;
	private String line_Start_Station;
	private String line_Stop_Station;
	private int line_Default_Fare;
	private int driver_Code;
	private int bus_Code;
	private Path filePath;
	private Directory dir;
	private String url;

	public Bus_Line_Info() {
		filePath = Paths.get("src\\bus_station\\APP.CONF");
		dir = new Directory(filePath);
		url = dir.getCombinedPath();
	}

	// methods
	protected void write(int lc, String lstart, String lstop, int dFare,
			int dCode, int bCode) {
		setLine_Code(lc);
		setLine_Start_Station(lstart);
		setLine_Stop_Station(lstop);
		setLine_Default_Fare(dFare);
		setDriver_Code(dCode);
		setBus_Code(bCode);
		try {
			File wFile = new File(url);
			if (!wFile.exists()) {
				wFile.createNewFile();
				System.out.println("creating new file...");
			} else {
				System.out.println("reWriting file...");

			}
			BufferedWriter wBuffer = new BufferedWriter(new FileWriter(wFile));

			wBuffer.write(String.format("LINE_CODE:%d", line_Code));
			wBuffer.newLine();
			wBuffer.write(String.format("LINE_START_STATION:%s",
					line_Start_Station));
			wBuffer.newLine();
			wBuffer.write(String.format("LINE_STOP_STATION:%s",
					line_Stop_Station));
			wBuffer.newLine();
			wBuffer.write(String.format("LINE_DEFAULT_FARE:%d",
					line_Default_Fare));
			wBuffer.newLine();
			wBuffer.write(String.format("DRIVER_CODE:%d", driver_Code));
			wBuffer.newLine();
			wBuffer.write(String.format("BUS_CODE:%d", bus_Code));

			wBuffer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void read() {
		String line;
		int i = 1;
		Map<Integer, String> list = new LinkedHashMap<Integer, String>();
		try {
			File rFile = new File(url);
			if (rFile.exists()) {
				BufferedReader rBuffer = new BufferedReader(new FileReader(
						rFile));

				while ((line = rBuffer.readLine()) != null) {
					for (String x : line.split("\\:")) {
						list.put(i, x);
						i++;
					}
				}
				rBuffer.close();

				for (int j = 1; j <= list.size(); j++) {
					switch (j) {
					case 2:
						setLine_Code(Integer.parseInt(list.get(j)));
						break;
					case 4:
						setLine_Start_Station(list.get(j));
						break;
					case 6:
						setLine_Stop_Station(list.get(j));
						break;
					case 8:
						setLine_Default_Fare(Integer.parseInt(list.get(j)));
						break;
					case 10:
						setDriver_Code(Integer.parseInt(list.get(j)));
						break;
					case 12:
						setBus_Code(Integer.parseInt(list.get(j)));
						break;

					}
				}

			} else {
				System.out.println(rFile.getAbsolutePath() + " not exist");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// setter and getters
	public int getLine_Code() {
		return line_Code;
	}

	public void setLine_Code(int lc) {
		this.line_Code = lc;
	}

	public String getLine_Start_Station() {
		return line_Start_Station;
	}

	public void setLine_Start_Station(String lStart) {
		this.line_Start_Station = lStart;
	}

	public String getLine_Stop_Station() {
		return line_Stop_Station;
	}

	public void setLine_Stop_Station(String lStop) {
		this.line_Stop_Station = lStop;
	}

	public int getLine_Default_Fare() {
		return line_Default_Fare;
	}

	public void setLine_Default_Fare(int ldFare) {
		this.line_Default_Fare = ldFare;
	}

	public int getDriver_Code() {
		return driver_Code;
	}

	public void setDriver_Code(int dc) {
		this.driver_Code = dc;
	}

	public int getBus_Code() {
		return bus_Code;
	}

	public void setBus_Code(int bc) {
		this.bus_Code = bc;
	}

	public Path getFilePath() {
		return filePath;
	}

	public void setFilePath(Path filePath) {
		this.filePath = filePath;
	}

	public Directory getDir() {
		return dir;
	}

	public void setDir(Directory dir) {
		this.dir = dir;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
