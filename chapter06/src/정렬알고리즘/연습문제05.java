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
		int left = 0; // 왼쪽 경계 인덱스
		int right = n - 1; // 오른쪽 경계 인덱스
		int last = right; // 마지막으로 교환된 위치를 저장하는 변수

		while (left < right) { // 왼쪽 경계와 오른쪽 경계가 만나지 않을 때까지 반복
			for (int j = right; j > left; j--) {
				// 배열의 뒤쪽부터 앞쪽으로 탐색하며 인접한 요소를 비교하여 정렬
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j); // 인접한 요소를 교환
					last = j; // 마지막으로 교환된 위치를 저장
				}
			}
			left = last; // 마지막으로 교환된 위치를 왼쪽 경계로 설정

			for (int j = left; j < right; j++) {
				// 배열의 앞쪽부터 뒤쪽으로 탐색하며 인접한 요소를 비교하여 정렬
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1); // 인접한 요소를 교환
					last = j; // 마지막으로 교환된 위치를 저장
				}
			}
			right = last; // 마지막으로 교환된 위치를 오른쪽 경계로 설정
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
