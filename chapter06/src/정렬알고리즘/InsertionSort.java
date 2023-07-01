package 정렬알고리즘;

import java.util.Scanner;

class InsertionSort {

	// 단순 삽입 정렬
	static void insertSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			// 현재 i번째 요소를 tmp 변수에 저장
			// i번째 요소 : 정렬되지 않은 부분의 첫 번째 요소
			// 정렬된 부분의 끝에서부터 시작하여 적절한 위치를 찾아서 삽입
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				// 정렬된 부분의 j-1번째 요소와 tmp를 비교하여 j-1번째 요소가 더 크면
				// j-1번째 요소를 j번째로 이동
				a[j] = a[j - 1];
			}
			// 정렬된 부분에서 tmp가 들어갈 위치인 j번째에 tmp 삽입
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		insertSort(x, nx); // 배열 x를 단순 삽입 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
