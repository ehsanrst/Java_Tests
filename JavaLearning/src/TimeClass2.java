// encapsulation, OverLoading, Setter Getter Lesson

public class TimeClass2 {

	private int hour;
	private int minute;
	private int second;

	// Encapsulation=====================
	// make setter and getter
	public void setHour(int h) {
		// this.hour = h; //just set
		hour = ((h >= 0 && h < 24) ? h : 0); // set conditional
	}

	public int getHour() {
		return this.hour;
	}

	public void setMinute(int m) {
		// this.minute = m;
		minute = ((m >= 0 && m < 60) ? m : 0);
	}

	public int getMinute() {
		return this.minute;
	}

	public void setSecond(int s) {
		// this.second = s ;
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	public int getSecond() {
		return this.second;
	}

	// Constructor====================
	// Multiple Constructor
	public TimeClass2() {
		this(0, 0, 0); // 'this' point to the constructor that have all 3
						// variables
	}

	// Overloading Constructor = means same name with different parameters
	public TimeClass2(int h) {
		this(h, 0, 0);
		// means if user just enter hour pass the others's value zero
	}

	// Overloading Constructor again
	public TimeClass2(int h, int m) {
		this(h, m, 0);

	}

	// Overloading Constructor again that have all 3 variables
	public TimeClass2(int h, int m, int s) {
		setTime(h, m, s); // call Method
		// means if user put h, m, s then put them automatically in setters
	}

	// Method========================
	private void setTime(int h, int m, int s) {
		// method that call setters automatically
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(),
				getSecond());
	}
}
