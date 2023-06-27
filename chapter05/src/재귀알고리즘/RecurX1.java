package 재귀알고리즘;

import java.util.Scanner;

public class RecurX1 {
	// 순수 재귀 메서드(꼬리 재귀 제거)
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		recur(x);

	}

}
