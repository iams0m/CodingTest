package 프로그래머스;

import java.util.Scanner;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(numbers, n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i < numbers.length; i++)
            if(answer <= n){
                answer += numbers[i];
            }
        return answer;
    }
}