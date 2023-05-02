package 프로그래머스;

import java.util.Scanner;

public class 배열의평균값 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution5 {
    	public double solution(int[] numbers) {
    		int size = numbers.length;
    		int sum = 0;
    		for (int x : numbers) {
				sum = sum + x;
			}
    		double answer = (double)sum / size;
    		return answer;
        }
}
