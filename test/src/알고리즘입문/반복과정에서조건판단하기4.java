package 알고리즘입문;

import java.util.Scanner;

public class 반복과정에서조건판단하기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}
		if (n % 2 != 0) {
			System.out.print("+");
		}

	}

}
