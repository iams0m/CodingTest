package 정렬알고리즘;

import java.util.Scanner;

public class QuickSort {

	// 배열 요소 a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left; // 왼쪽 커서 초기화
		int pr = right; // 오른쪽 커서 초기화
		int x = a[(pl + pr) / 2]; // 피벗(가운데 요소) 설정

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

		// 분할된 부분 배열을 재귀적으로 정렬
		if (left < pr) {
			quickSort(a, left, pr); // 왼쪽 부분 배열을 재귀 호출하여 정렬
		}
		if (pl < right) {
			quickSort(a, pl, right); // 오른쪽 부분 배열을 재귀 호출하여 정렬
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.println("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		quickSort(x, 0, nx - 1); // 배열 x를 퀵 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
