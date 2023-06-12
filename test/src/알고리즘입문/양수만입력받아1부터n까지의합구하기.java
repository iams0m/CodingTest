package 알고리즘입문;

import java.util.Scanner;

public class 양수만입력받아1부터n까지의합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		// 0이나 음숫값을 입력하면 다시 'n값: '이 출력되며 사용자에게 새로 입력할 것을 요구
		// 양수만 입력받기 위해 do while문 사용
		do {
			System.out.println("n값: ");
			n = sc.nextInt();
		} while (n <= 0); // n이 0이나 음숫값이면, do 아래 내용을 실행

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
