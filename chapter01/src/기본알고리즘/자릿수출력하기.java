package 기본알고리즘;

import java.util.Scanner;

public class 자릿수출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정숫값의 자릿수를 구합니다.");
		int n;
		do {
			System.out.print("정숫값 : ");
			n = sc.nextInt();
		} while (n <= 0); // n이 양수가 될 때까지 본문 내용 반복

		
		// 자릿수 계산
		int no = 0; // 자릿수 초깃값
		while (n > 0) {
			n /= 10; // n을 10으로 나눕니다
			no++;
		}
		System.out.println("그 수는 " + no + "자리입니다.");
	}

}
