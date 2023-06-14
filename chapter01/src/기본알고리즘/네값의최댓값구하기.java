package 기본알고리즘;

import java.util.Scanner;

public class 네값의최댓값구하기 {

	// 최댓값을 반복해서 구할 때에는 메서드로 처리하면 편리
	static int max(int a, int b, int c, int d) {
		int max = a;

		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");  a = sc.nextInt();
		System.out.print("b의 값 : ");  b = sc.nextInt();
		System.out.print("c의 값 : ");  c = sc.nextInt();
		System.out.print("d의 값 : ");  d = sc.nextInt();
		
		int max = max(a, b, c, d);
		
		System.out.println("최댓값은 " + max + "입니다.");

	}
}
