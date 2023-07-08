package in.ineuron.assgnment7;

public class ReverseStringQ4 {
	public static String reverseWords(String s) {
		String[] words = s.split(" "); 
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse(); // Reverse each word
			result.append(reversedWord).append(" ");
		}

		result.setLength(result.length() - 1);

		return result.toString();
	}

	public static void main(String[] args) {
		// Q.4
		String s = "Let's take a ride";

		String reversedString = reverseWords(s);
		System.out.println(reversedString);

	}

}
