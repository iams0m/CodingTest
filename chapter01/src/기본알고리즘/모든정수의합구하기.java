package 기본알고리즘;

import java.util.Scanner;

public class 모든정수의합구하기 {

	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // 총합
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이에 있는 모든 정수의 총합을 구합니다.");
		System.out.print("a값: ");
		int a = sc.nextInt();
		System.out.print("b값: ");
		int b = sc.nextInt();

		System.out.println("정수 a, b 사이의 모든 정수의 총합은 " + sumof(a, b) + "입니다.");
	}

}
