package 기본알고리즘;

import java.util.Scanner;

public class 입력한정숫값판단하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("Ａ");
		} else if (n == 2) {
			System.out.println("Ｂ");
		} else {
			System.out.println("Ｃ");
		}
	}

}
