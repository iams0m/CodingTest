package 알고리즘입문;

import java.util.Scanner;

public class 반복과정에서조건판단하기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.println("n값: ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.println(i + " + ");
			} else {
				System.out.println(i + " = ");
			}

			sum += i;
		}

		System.out.println(sum);
	}

}
