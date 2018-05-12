public class TimeClass3 {

	private int month;
	private int day;
	private int year;

	// Constructor
	public TimeClass3(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;

		System.out.println(String.format("Constructor is for %s\n", this));
		// OR: // System.out.printf("Constructor is for %s\n", this);

		/*
		 * "this" in print format will Override method of toString; means that
		 * when in 'other' class make an 'object' from "this" class and don't
		 * call a method with it!!! then object must return something to that
		 * class; for example: other class call a String line with it's method
		 * of "Print" that always print a String line, anyway here this "this"
		 * means "this.object" that build or built in other class; and point to
		 * all of "this" class; in the other hand 'that' class request an String
		 * line with 'Print' method that must be answer with a String by "this
		 * class" by the way "this" (here it is an argue) isn't a string (it is
		 * hole class)then will use "toString" method in it (it is a
		 * converter)to convert argues in this class to string type and return
		 * to 'that class' what called
		 */

		/*
		 * ATTENTION: if we have not toString method in this class, this class
		 * use it's parent toString method (Object Class)
		 */

		/*
		 * HINT: methods of "equals()" and "hashCode()" is the same to call like
		 * toString() if they be needed
		 */

	}

	// inner method of Java called by Ctrl+Space like Override

	@Override
	// a TAG to tell the java what's the point of this method
	public String toString() {
		return String.format("%02d/%02d/%d", month, day, year);
		/*
		 * OR: // return "TimeClass{" + "month=" + month + ", day=" + day +
		 * ", year=" + year;
		 */

	}
}
