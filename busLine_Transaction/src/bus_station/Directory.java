package bus_station;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {
	private Path rootPath;
	private String combinedPath;

	public Directory(Path partialPath) {
		String userDir = System.getProperty("user.dir");
		setRootPath(Paths.get(userDir));
		setCombinedPath(String.format("%s", rootPath.resolve(partialPath)));
	}

	public Path getRootPath() {
		return rootPath;
	}

	public void setRootPath(Path rPath) {
		this.rootPath = rPath;
	}

	public String getCombinedPath() {
		return combinedPath;
	}

	public void setCombinedPath(String p) {
		this.combinedPath = p;
	}

}
