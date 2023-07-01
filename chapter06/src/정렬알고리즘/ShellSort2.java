package 정렬알고리즘;

import java.util.Scanner;

class ShellSort2 {

	// 셸 정렬(h = …, 40, 13, 4, 1)
	static void shellSort(int[] a, int n) {
		int h;
		
		// 초기 간격(h) 설정
		for (h = 1; h < n; h = h * 3 + 1) { // 1부터 시작하여 값을 3배하고 1을 더하면서 n을 넘지 않는 가장 큰 값을 h에 대입
			;
		}
		
		// 간격(h)을 점차 줄여가며 셸 정렬 수행
		for (; h > 0; h /= 3) { // 초기 간격은 n/3보다 작은 가장 큰 간격으로 설정
			// 단순 삽입 정렬과 유사한 방식으로 각 그룹 내에서 정렬 수행
			// 간격 h만큼 떨어진 요소들을 삽입 정렬
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				// j : 현재 요소의 바로 앞 요소
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					// 정렬된 그룹 내에서 tmp보다 큰 요소를 만나면
					// j번째 요소를 j+h번째로 이동
					a[j + h] = a[j];
				}
				// 삽입할 위치를 찾은 후, tmp를 그 위치에 삽입
				a[j + h] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("셸 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		shellSort(x, nx); // 배열 x를 셸 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
