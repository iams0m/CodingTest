package 정렬알고리즘;

import java.util.Scanner;

// 퀵 정렬(요솟수가 적은 그룹을 먼저 나누기 : 재귀 버전)
public class 연습문제12_1 {

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

		// 왼쪽 그룹과 오른쪽 그룹의 크기를 비교하여 더 작은 쪽을 먼저 정렬하는 방식
		if (pr - left < right - pl) {
			// 왼쪽 그룹의 크기가 작은 경우

			int temp;
			temp = left;
			left = pl;
			pl = temp;
		}

		if (left < pr) {
			// 왼쪽 그룹에 2개 이상의 요소가 있는 경우
			quickSort(a, left, pr);
		}
		if (pl < right) {
			// 오른쪽 그룹에 2개 이상의 요소가 있는 경우
			quickSort(a, pl, right);
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
