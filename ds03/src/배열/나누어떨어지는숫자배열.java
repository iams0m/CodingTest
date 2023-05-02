package 배열;

import java.util.*;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		Solution8 sol = new Solution8();
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution8 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);

			}
		}
		int[] answer = new int[list.size()];
		if (list.size() != 0) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		Arrays.sort(answer);
		return answer;
	}
}