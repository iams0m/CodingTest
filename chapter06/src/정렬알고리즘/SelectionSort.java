package 정렬알고리즘;

import java.util.Scanner;

public class SelectionSort {

	// 두 요소의 위치를 교환하는 메소드
	// 배열 요소 a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 단순 선택 정렬
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i; // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스 저장
			// 아직 정렬되지 않은 부분에서 가장 작은 요소를 찾기 위해 반복문 실행
			// i번째 요소는 이미 정렬된 상태이므로, i+1부터 n-1까지의 요소 비교
			for (int j = i + 1; j < n; j++) {
				// 현재까지의 최소값인 min에 저장된 인덱스의 요소와 j번째 인덱스의 요소 비교
				// j번째 요소가 현재까지의 최소값보다 작으면 min을 j로 업데이트
				if (a[j] < a[min]) {
					min = j;
				}

			}
			swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소(a[i])와 가장 작은 요소(a[min])를 교환
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단순 선택 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		selectionSort(x, nx); // 배열 x를 단순 선택 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}

}
