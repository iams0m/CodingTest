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
					stack.pop(); // ')'로 시작할 때 pop할 게 없어서 에러 발생 ! => try-catch 사용
				}
			}

			answer = stack.empty(); // '('가 남아있으면 X
		} catch (Exception e) {
			answer = false;
		}

		System.out.println(answer);

	}

}
