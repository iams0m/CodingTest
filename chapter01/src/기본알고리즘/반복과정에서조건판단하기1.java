package 기본알고리즘;

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

		// 마지막 과정을 실행하기 위한 방법을 알고 있는데도 반복할 때마다 항상 조건을 판단하여 실행하는 것은 프로그램의 효율을 떨어트림
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}

			sum += i;
		}

		System.out.println(sum);
	}

}
