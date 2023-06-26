package 재귀알고리즘;

import java.util.Scanner;

// gcd 메서드를 비재귀적으로 구하기
public class 연습문제02 {
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 정수의 최대공약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();

		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}

}