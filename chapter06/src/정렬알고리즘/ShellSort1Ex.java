package 정렬알고리즘;

import java.util.Scanner;

class ShellSort1Ex {

	// 셸 정렬(요소의 이동 횟수 카운드)
	static int shellSort(int[] a, int n) {
		int count = 0; // 이동 횟수
		for (int h = n / 2; h > 0; h /= 2) {
			// 간격(h)을 점차 줄여가며 셸 정렬 수행
			// h : 배열을 그룹으로 나누는 간격
			// 반복을 수행할 때마다 h를 2로 나누어 절반을 만듦

			// 삽입 정렬과 유사한 방식으로 각 그룹 내에서 정렬 수행
			// 간격 h만큼 떨어진 요소들을 삽입 정렬
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				// 간격 h만큼 떨어진 요소들을 삽입 정렬
				// j : 현재 요소의 바로 앞 요소
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					// 정렬된 그룹 내에서 tmp보다 큰 요소를 만나면
					// j번째 요소를 j+h번째로 이동
					a[j + h] = a[j];
				}
				// 삽입할 위치를 찾은 후, tmp를 그 위치에 삽입
				a[j + h] = tmp;
				count++;
			}
		}
		return count;
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

		int count = shellSort(x, nx); // 배열 x를 셸 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		System.out.println("요소의 이동 횟수는 " + count + "번 입니다.");

	}

}
