package 정렬알고리즘;

import java.util.Scanner;

public class BubbleSort3 {

	// 배열 요소 a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블 정렬(스캔 범위 한정)
	static void bubbleSort(int[] a, int n) {
		int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
		while (k < n - 1) {
			int last = n - 1; // 마지막으로 요소를 교환한 위치
			// 패스
			for (int j = n - 1 ; j > k; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			k = last; // 하나의 패스를 마쳤을 때 last값을 k에 대입하여 다음에 수행할 패스의 범위 제한
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("버블 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		bubbleSort(x, nx); // 배열 x를 단순 교환 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}

}
