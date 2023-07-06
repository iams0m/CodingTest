package 정렬알고리즘;

import java.util.Scanner;

// 퀵 정렬(비재귀 버전 : 스택에 푸시, 팝, 나누는 과정 출력)
public class 연습문제11 {

	// 배열 요소 a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 퀵 정렬(비재귀 버전)
	static void quickSort(int[] a, int left, int right) {
		// 두 스택의 크기 : right - left + 1(나눌 배열의 요솟수)
		IntStack lstack = new IntStack(right - left + 1); // 왼쪽 범위를 저장하는 스택
		IntStack rstack = new IntStack(right - left + 1); // 오른쪽 범위를 저장하는 스택

		// 나눌 배열의 '첫 요소'와 '끝 요소'의 인덱스를 스택에 푸시
		lstack.push(left); // 초기 왼쪽 커서를 스택에 push
		rstack.push(right); // 초기 오른쪽 커서를 스택에 push
		System.out.printf("a[%d]~a[%d]을 나누는 문제를 스택에 푸시합니다.\n", left, right);

		System.out.print("Lstack:");
		lstack.dump();
		System.out.print("Rstack:");
		rstack.dump();

		// 스택이 비어 있지 않으면 처리 반복
		while (!lstack.isEmpty()) {
			int pl = left = lstack.pop(); // 왼쪽 커서
			int pr = right = rstack.pop(); // 오른쪽 커서
			int x = a[(left + right) / 2]; // 피벗(가운데 요소)
			System.out.printf("스택에서 나누는 문제를 꺼냈습니다. a[%d]~a[%d]을 나눕니다.\n", left, right);

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

			// 분할된 부분 배열을 스택에 push하여 정렬을 위해 저장
			if (left < pr) {
				lstack.push(left); // 왼쪽 그룹 범위의 인덱스 push
				rstack.push(pr);
				System.out.printf("a[%d]~a[%d]을 나누는 문제를 스택에 푸시합니다.\n", left, pr);

				System.out.print("Lstack:");
				lstack.dump();
				System.out.print("Rstack:");
				rstack.dump();
			}
			if (pl < right) {
				lstack.push(pl); // 오른쪽 그룹 범위의 인덱스 push
				rstack.push(right);
				System.out.printf("a[%d]~a[%d]을 나누는 문제를 스택에 푸시합니다.\n", pl, right);

				System.out.print("Lstack:");
				lstack.dump();
				System.out.print("Rstack:");
				rstack.dump();
			}
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
