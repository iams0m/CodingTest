package 배열;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution3 {
	public int[] solution(int n) {
		int[] answer = new int[(n+1)/2];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				answer[j] = i;
				j++;
			}
		}
		return answer;
    }
}