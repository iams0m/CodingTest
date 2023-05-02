package 스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		String s = "))()";

		Stack<Character> stack = new Stack<>();
		boolean answer = false;
		try {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}
			}

			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}

		System.out.println(answer);

	}

}
