package 프로그래머스;

import java.util.Scanner;

public class 종이자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		Solution2 sol = new Solution2();
		int answer = sol.solution(M, N);
		System.out.println(answer);
		sc.close();

	}
}

class Solution2 {
	 public int solution(int M, int N) {
	        return (M - 1) + M * (N - 1);
	        
	    }
	}