package 프로그래머스;

import java.util.Scanner;

public class 세균증식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		Solution2 sol = new Solution2();
		int answer = sol.solution(n, t);
		System.out.println(answer);
		sc.close();

	}
}

class Solution2 {
	 public int solution(int n, int t) {
	        return (int) (n * Math.pow(2, t));
	    }
	}