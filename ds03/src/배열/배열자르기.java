package 배열;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		Solution9 sol = new Solution9();
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution9 {
	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < num2 - num1 + 1; i++) {
			answer[i] = numbers[i + num1];
		}
        return answer;
    }
}