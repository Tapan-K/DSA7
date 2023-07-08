package in.ineuron.assgnment7;

import java.util.*;

public class StrobogrammaticNumberQ2 {
	public static boolean isStrobogrammatic(String num) {
		// Create a mapping of strobo grammatic digits
		Map<Character, Character> mapping = new HashMap<>();
		mapping.put('0', '0');
		mapping.put('1', '1');
		mapping.put('6', '9');
		mapping.put('8', '8');
		mapping.put('9', '6');

		// Check if the number remains the same after rotating 180 degrees
		int left = 0;
		int right = num.length() - 1;

		while (left <= right) {
			char leftDigit = num.charAt(left);
			char rightDigit = num.charAt(right);

			// If the left and right digits are not the same in the mapping, or they are not
			// strobogrammatic digits, return false
			if (!mapping.containsKey(leftDigit) || mapping.get(leftDigit) != rightDigit) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		// Q.2
		String num = "69";

		boolean isStrobogrammatic = isStrobogrammatic(num);
		System.out.println("is this number Strobogrammatic ? " + isStrobogrammatic);

	}

}
