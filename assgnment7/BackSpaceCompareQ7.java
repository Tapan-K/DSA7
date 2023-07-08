package in.ineuron.assgnment7;
import java.util.*;

public class BackSpaceCompareQ7 {
	public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

	public static void main(String[] args) {
		//Q.7
		String s = "ab#c";
        String t = "ad#c";

        boolean areEqual = backspaceCompare(s, t);
        System.out.println(areEqual);

	}

}
