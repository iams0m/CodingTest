package 기본알고리즘;

import java.util.Scanner;

public class 정사각형출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("정사각형을 출력합니다.");

		do {
			System.out.print("변의 길이 : ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print('*');
			}
			System.out.println();

		}

	}

}
