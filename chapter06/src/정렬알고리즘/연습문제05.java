package 정렬알고리즘;

import java.util.Scanner;

public class 연습문제05 {

	// 배열 요소 a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 양방향 버블 정렬(셰이커 정렬)
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양방향 버블 정렬(셰이커 정렬)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		shakerSort(x, nx); // 배열 x를 양방향 버블 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}

}
