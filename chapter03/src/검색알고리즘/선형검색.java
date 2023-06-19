package 검색알고리즘;

import java.util.Scanner;

public class 선형검색 {

	// 선형 검색 : 배열에서 원하는 값을 찾기 위해 배열의 처음부터 끝까지 순차적으로 탐색하는 알고리즘
	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)
				return -1; // 검색 실패(-1을 반환), key값과 일치하는 요소를 발견하지 못하고 배열의 끝을 지나간 경우
			if (a[i] == key)
				return i; // 검색 성공(인덱스를 반환), key값과 일치하는 요소를 발견한 경우
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: "); // 키값을 입력 받음
		int ky = sc.nextInt();

		int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
	}
}