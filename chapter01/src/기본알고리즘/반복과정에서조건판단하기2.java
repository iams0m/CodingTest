package 기본알고리즘;

import java.util.Scanner;

public class 반복과정에서조건판단하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.println("n값: ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;

		// if가 빠진 반복문
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}

		//System.out.println(n + " = ");
		//sum += n;
		//System.out.println(sum);
		
		// 위의 세 줄을 한 줄로 나타내기
		System.out.println(n + " = " + (sum += n));
	}

}
