package 알고리즘입문;

import java.util.Scanner;

public class 두자리양수입력받기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;

		System.out.println("2자리의 양수를 입력하세요.");

		do {
			System.out.print("no값: ");
			no = sc.nextInt();
		} while (no < 10 || no > 99); // 변수 no에 입력한 값이 10보다 작거나 99보다 크면 루프 본문을 반복합니다.

		System.out.println("변수 no값은" + no + "이(가) 되었습니다.");

	}

}
