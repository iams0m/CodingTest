package 알고리즘입문;

import java.util.Scanner;

public class 직각이등변삼각형출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력니다.");

		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = sc.nextInt();
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) { // 행 루프
			for (int j = 1; j <= i; j++) { // 열 루프
				System.out.print('*');
			} // 열 루프 종료
			System.out.println(); // 줄 바꿈
		} // 행 루프 종료

	}

}
