package in.ineuron.assgnment7;

public class ReverseStringGroupsQ5 {
	public static String reverseString(String s, int k) {
		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i += 2 * k) {
			int start = i;
			int end = Math.min(i + k - 1, s.length() - 1);

			while (start < end) {
				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			}
		}

		return String.valueOf(chars);
	}

	public static void main(String[] args) {
		// Q.5
		String s = "abcdefg";
		int k = 2;

		String reversedString = reverseString(s, k);
		System.out.println(reversedString);

	}

}
