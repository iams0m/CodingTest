package 재귀알고리즘;

import java.util.Scanner;

// 재귀 함수를 메모화로 구현하기
public class RecurMemo {
	static String[] memo;
	static int count;

	// 메모화를 도입한 메서드 recur
	static void recur(int n) {
		count++;
		if (memo[n + 1] != null) {
			System.out.println(memo[n + 1]); // 메모 출력
		} else {
			if (n > 0) {
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
			} else {
				memo[n + 1] = ""; // 메모화 : recur(0)과 recur(-1)은 빈 문자열
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();

		memo = new String[x + 2];
		recur(x);

		System.out.println("메서드를 호출한 회수 : " + count);
	}

}
