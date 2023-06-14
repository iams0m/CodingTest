package 기본알고리즘;

import java.util.Scanner;

public class 정수의합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = sc.nextInt();

		int sum = 0; // 합 초기화
		int i = 1; // 반복을 제어하기 위한 변수 i 초기화

		while (i <= n) {
			sum += i; // 이항 연산자(피연산자 2개)
			i++; // 단항 연산자(피연산자 1개)
		}

		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}

}
