package 스택;

import java.util.*;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		Stack<Integer> stack = new Stack<>();
		for (int item : arr) {
			stack.push(item);
		}
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		for (int i = answer.length - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}
