package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		// 하나씩 분리하고
		String[] s = String.valueOf(n).split(""); // String.valueOf(n) => long을 string으로 바꾸어줌
		System.out.println(Arrays.toString(s));
		int[] answer = new int[s.length];
		// stack에 순서대로 넣고
		Stack<String> stack = new Stack<>();
		for (String c : s) {
			stack.push(c);
		}
		System.out.println(stack); // [1, 2, 3, 4, 5]
		// int[]에 옮기기
		for (int i = 0; i < s.length; i++) {
			answer[i] = Integer.parseInt(stack.pop()); // 뒤에서부터 꺼내어 순서대로 넣어줌
		}
		System.out.println(Arrays.toString(answer)); // [5, 4, 3, 2, 1]
	}

}
