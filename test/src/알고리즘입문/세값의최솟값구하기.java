package 알고리즘입문;

import java.util.Scanner;

public class 세값의최솟값구하기 {

	// 최솟값을 반복해서 구할 때에는 메서드로 처리하면 편리
	static int min(int a, int b, int c) {
		int min = a;

		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : ");  a = sc.nextInt();
		System.out.print("b의 값 : ");  b = sc.nextInt();
		System.out.print("c의 값 : ");  c = sc.nextInt();
		
		int min = min(a, b, c);
		
		System.out.println("최솟값은 " + min + "입니다.");

	}
}
