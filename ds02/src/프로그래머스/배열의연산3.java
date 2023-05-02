package 프로그래머스;

import java.util.Arrays;

public class 배열의연산3 {

	public static void main(String[] args) {
		//두 수를 곱했을 때 가장 큰 숫자를 구해보세요.
		Solution8 sol = new Solution8();
		int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
		
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution8 {
    	public int solution(int[] numbers) {
    		Arrays.sort(numbers); //파괴형
    		int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
    		return answer;
        }
}
