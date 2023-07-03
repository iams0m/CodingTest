package 정렬알고리즘;

import java.util.Scanner;

public class Partition {

	// 배열 요소 a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열을 나눔
	static void partition(int[] a, int n) {
		int pl = 0; // 왼쪽 커서 초기화
		int pr = n - 1; // 오른쪽 커서 초기화
		int x = a[n / 2]; // 피벗(가운데 요소) 설정

		// 퀵 정렬의 분할 과정을 수행하는 do-while 루프
		do {
			// 왼쪽 커서(pl)를 오른쪽으로 이동하며 피벗 이상의 값을 찾음
			while (a[pl] < x) {
				pl++;
			}

			// 오른쪽 커서(pr)를 왼쪽으로 이동하며 피벗 이하의 값을 찾음
			while (a[pr] > x) {
				pr--;
			}

			// 왼쪽 커서(pl)가 오른쪽 커서(pr)보다 작거나 같으면
			// pl과 pr이 가리키는 요소를 교환하고, 각각 한 칸씩 이동
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while (pl <= pr); // 왼쪽 커서(pl)가 오른쪽 커서(pr)보다 작거나 같을 때까지 반복

		// 피벗 값 출력
		System.out.println("피벗 값은 " + x + "입니다.");

		// 피벗 이하의 그룹 출력
		System.out.println("피벗 이하 그룹");
		for (int i = 0; i <= pl - 1; i++) { // a[0]부터 a[pl - 1]까지 출력
			System.out.println(a[i] + " ");
		}
		System.out.println();

		// 피벗과 일치하는 그룹 출력
		if (pl > pr + 1) {
			System.out.println("피벗과 일치하는 그룹");
			for (int i = pr + 1; i <= pl - 1; i++) { // a[pr + 1]부터 a[pl - 1]까지 출력
				System.out.println(a[i] + " ");
			}
			System.out.println();
		}

		// 피벗 이상의 그룹 출력
		System.out.println("피벗 이상 그룹");
		for (int i = pr + 1; i < n; i++) { // a[pr + 1]부터 a[n - 1]까지 출력
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열을 나눕니다.");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		partition(x, nx); // 배열 x를 나눔

	}

}
