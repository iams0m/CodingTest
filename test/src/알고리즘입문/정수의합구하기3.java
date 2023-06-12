package 알고리즘입문;

import java.util.Scanner;

public class 정수의합구하기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = sc.nextInt();

		int sum = 0; // 합 초기화

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}

}
