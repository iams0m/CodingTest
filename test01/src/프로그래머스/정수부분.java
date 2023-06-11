package 프로그래머스;

import java.util.Scanner;

public class 정수부분 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double flo = (double) sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(flo);
		System.out.println(answer);
		sc.close();

	}

}

class Solution {
	 public int solution(double flo) {
		return (int) flo;
	}
}
