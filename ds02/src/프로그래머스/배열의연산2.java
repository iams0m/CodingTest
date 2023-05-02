package 프로그래머스;

import java.util.Scanner;

public class 배열의연산2 {

	public static void main(String[] args) {
		//두 수를 곱했을 때 가장 큰 숫자를 구해보세요.
		//배열이 오름차순으로 정렬이 되어 있는 상태
		Solution7 sol = new Solution7();
		int[] numbers = {-30, -20, 10, 11, 12, 13};
		//{-30, -20, 10, 20, 30, 40}
		
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution7 {
    	public int solution(int[] numbers) {
    		int post = numbers[numbers.length - 2] * numbers[numbers.length - 1];
    		int pre = numbers[0] * numbers[1];
    		int answer = 0;
    		if (post > pre) {
				answer = post;
			}else if (pre > post) {
				answer = pre;
			}
    		return answer;
        }
}
