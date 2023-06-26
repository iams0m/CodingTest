package 재귀알고리즘;

import java.util.Scanner;

// fatorial 메서드를 비재귀적으로 구하기
public class 연습문제01 {

	static int factorial(int n) {
		int fact = 1;

		while (n > 1) {
			fact *= n--;
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
