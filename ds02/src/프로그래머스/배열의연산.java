package 프로그래머스;

import java.util.Scanner;

public class 배열의연산 {

	public static void main(String[] args) {
		//세 수를 더했을 때 가장 큰 숫자를 구해보세요.
		//배열이 오름차순으로 정렬이 되어 있는 상태
		Solution6 sol = new Solution6();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution6 {
    	public int solution(int[] numbers) {
    		int answer = 0;
    		for (int i = numbers.length - 3; i < numbers.length; i++) {
    			answer = answer + numbers[i];
			}
    		return answer;
        }
}
