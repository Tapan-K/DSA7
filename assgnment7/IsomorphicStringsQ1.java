package in.ineuron.assgnment7;

import java.util.*;

public class IsomorphicStringsQ1 {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> charMap = new HashMap<>();
		Map<Character, Boolean> visited = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (charMap.containsKey(c1)) {
				if (charMap.get(c1) != c2) {
					return false; // Different mapping found for the same character in s and t
				}
			} else {
				if (visited.containsKey(c2)) {
					return false; // Two characters in s map to the same character in t
				}

				charMap.put(c1, c2);
				visited.put(c2, true);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Q.1
		String s = "egg";
		String t = "add";

		boolean isIsomorphic = isIsomorphic(s, t);
		System.out.println("Is this strings isomorphic " + isIsomorphic);

	}

}
