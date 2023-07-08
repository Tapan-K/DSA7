package in.ineuron.assgnment7;

public class StringShiftingQ6 {
	public static boolean canShiftString(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}

		String concatenated = s + s;
		return concatenated.contains(goal);
	}

	public static void main(String[] args) {
		// Q.6
		String s = "abcde";
		String goal = "cdeab";

		boolean canShift = canShiftString(s, goal);
		System.out.println(canShift);

	}

}
