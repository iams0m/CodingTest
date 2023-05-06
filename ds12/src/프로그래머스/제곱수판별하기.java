package 프로그래머스;

import java.util.Scanner;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution6 sol = new Solution6();
		int answer = sol.solution(n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution6 {
	public int solution(int n) {
        for (int i = 0; i <= 1000; i++) {
			if (i * i == n) {
				return 1;
			}
		}
        return 2;
    }
}