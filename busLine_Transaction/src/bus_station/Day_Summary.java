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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

//to build day_summary reports File
public class Day_Summary {
	private Path filePath;
	private Directory dir;
	private String url;
	private Bus_Line_Info config;
	private Passenger pass;
	private Date date;
	private int count;
	private SimpleDateFormat sdf;
	private SimpleDateFormat sdf2;
	private SimpleDateFormat sdf3;
	private int passenger_fare;
	private boolean endDailyWorkTime;
	private boolean esc;

	// constructor
	public Day_Summary() {
		filePath = Paths
				.get("src\\bus_station\\Transaction_Files\\%d_%d_%s.HMTR");
		dir = new Directory(filePath);
		url = dir.getCombinedPath();
		config = new Bus_Line_Info();
		config.read();
		pass = new Passenger();
		date = new Date();
		sdf = new SimpleDateFormat("yyMMddhhmma");
		sdf2 = new SimpleDateFormat("hhmma");
		sdf3 = new SimpleDateFormat("yyMMdd");
	}

	// method
	protected void write() {

		try {
			File wFile = new File(String.format(url, config.getBus_Code(),
					config.getLine_Code(), sdf3.format(date)));
			if (!wFile.exists()) {
				wFile.createNewFile();
				System.out.println("creating new file...");
				BufferedWriter wBuffer = new BufferedWriter(new FileWriter(
						wFile));
				wBuffer.write(String.format("SSO,%s,%d,%d,%d,%d,ESO",
						sdf.format(date), config.getDriver_Code(),
						config.getLine_Code(), config.getLine_Default_Fare(),
						config.getBus_Code()));
				wBuffer.newLine();
				wBuffer.close();
				wpInfo(wFile);

			} else {

				if (endDailyWorkTime) {

					BufferedWriter wBuffer = new BufferedWriter(new FileWriter(
							wFile, true));
					wBuffer.write(String.format("SSC,%s,%d,ESC",
							sdf2.format(date), getCount()));
					wBuffer.close();
				} else {
					System.out.println("updating file...");
					wpInfo(wFile);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void read() {

		try {
			File rFile = new File(String.format(url, config.getBus_Code(),
					config.getLine_Code(), sdf3.format(date)));
			if (rFile.exists()) {
				BufferedReader rBuffer = new BufferedReader(new FileReader(
						rFile));
				int i = 1;
				Map<Integer, String> list = new LinkedHashMap<Integer, String>();
				String line;
				while ((line = rBuffer.readLine()) != null) {
					for (String x : line.split("\\n")) {
						list.put(i, x);
						i++;
					}
				}
				setCount((i - 2));
				line = list.get(list.size());
				if (line.indexOf("ESC") != -1) {
					setEsc(true);
				}
				rBuffer.close();
			} else {
				System.out.println(rFile.getAbsolutePath() + " not exist");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void wpInfo(File wFile) {
		passenger_fare = (int) (pass.getFare_coefficient() * config
				.getLine_Default_Fare());
		System.out.println(passenger_fare + " RLs");
		try {
			BufferedWriter wBuffer = new BufferedWriter(new FileWriter(wFile,
					true));
			wBuffer.write(String.format("STR,%s,%d,%d,ETR", sdf2.format(date),
					pass.getPassenger_Code(), passenger_fare));
			wBuffer.newLine();
			wBuffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// getter and setters
	public Bus_Line_Info getConfig() {
		return config;
	}

	public Date getDate() {
		return date;
	}

	public Passenger getPass() {
		return pass;
	}

	public double getPassenger_fare() {
		return passenger_fare;
	}

	public boolean isEndDailyWorkTime() {
		return endDailyWorkTime;
	}

	public void setEndDailyWorkTime(boolean endDailyWorkTime) {
		this.endDailyWorkTime = endDailyWorkTime;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public SimpleDateFormat getSdf2() {
		return sdf2;
	}

	public SimpleDateFormat getSdf3() {
		return sdf3;
	}

	public boolean isEsc() {
		return esc;
	}

	public void setEsc(boolean esc) {
		this.esc = esc;
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
