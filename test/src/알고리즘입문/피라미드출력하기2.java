package 알고리즘입문;

import java.util.Scanner;

public class 피라미드출력하기2 {

	static void nspira(int n) {
		for (int i = 1; i <= n; i++) { // 행 루프
			for (int j = 1; j <= n - i; j++) // n - i 개의 ' ' 을 출력
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) { // 열 루프
				System.out.print(i % 10);
			} // 열 루프 종료
			System.out.println();
		} // 행 루프 종료
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드를 출력합니다.");

		do {
			System.out.print("단수는：");
			n = sc.nextInt();
		} while (n <= 0);

		nspira(n);
	}

}
