public class TimeClass {
	// variable members of this class:
	private int hour;
	private int minute;
	private int second;

	public void setTime(int hour, int m, int s) {
		// h, m, s are local variables and value of these
		// will given to global variables

		this.hour = ((hour >= 0 && hour <= 24) ? hour : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
		// any time we want to use VALUE of global variables instead
		// we must type for example "this.hour"
		// this.hour = h; and don't use set time in other class
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
		// %02d means to format number to Two decimal 5 ==> 05
	}

	public String toString() {
		return String.format("%d:%02d:%02d:%s", ((hour == 0 || hour == 12) ? 12
				: hour % 12), minute, second, (hour < 12 ? "am" : "pm"));
		// %d means to format number to one decimal 5 ==> 5
		// %s means normal string format for strings
	}
}
