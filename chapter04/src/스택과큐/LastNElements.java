package 스택과큐;

// 원하는 개수만큼 값을 계속 입력받고, 요솟수가 N인 배열에 마지막 N개를 저장

import java.util.Scanner;

class LastNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10; // 배열의 크기를 상수로 선언 (10개의 요소 저장)
		int[] a = new int[N]; // 크기가 10인 배열 a 선언
		int cnt = 0; // 입력된 값의 개수를 저장할 변수
		int retry; // 계속 할지 여부를 저장할 변수

		System.out.println("정수를 입력하세요.");

		do {
			System.out.printf("%d번째 정수: ", cnt + 1);
			a[cnt++ % N] = sc.nextInt(); // 입력된 값을 배열의 요소에 저장하고, cnt 값을 증가시킴
			System.out.print("계속 할까요? (Yes(1) / No(0) : ");
			retry = sc.nextInt(); // 계속 할지 여부를 입력 받음
		} while (retry == 1); // 1이 입력되면 계속 반복

		int i = cnt - N; // 출력할 데이터의 시작 인덱스 계산
		if (i < 0)
			i = 0; // 데이터의 개수가 N보다 작으면 0부터 시작

		for (; i < cnt; i++) // i값부터 cnt값까지 요소를 순회하기 위해 시작 인덱스를 명시적으로 표시하지 않음
			System.out.printf("%2d번째 ＝ %d\n", i + 1, a[i % N]); // 배열의 마지막 10개 요소를 출력

		/*
		 * for (int index = i; i < cnt; i++) System.out.printf("%2d번째 ＝ %d\n", i + 1,
		 * a[i % N]);
		 */
	}
}