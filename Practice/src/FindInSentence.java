import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindInSentence {

	private static final String REGEX = "foo";
	private static final String INPUT = "oooooooofooooooooo";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String args[]) {
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);

		System.out.println("Result of searching \"" + REGEX + "\" inside \""
				+ INPUT + "\" is:");

		System.out.println("lookingAt(): " + matcher.lookingAt());
	}
}
