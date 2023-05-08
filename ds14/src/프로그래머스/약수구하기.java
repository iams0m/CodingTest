package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution3 sol = new Solution3();
		String answer = sol.solution(n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution3 {
	public String solution(int n) {
		int count = 0;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		int[] answer = new int[count];
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[j] = i;
				j++;
			}
		}
		return Arrays.toString(answer);
	}
}