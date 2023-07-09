package 정렬알고리즘;

import java.util.Scanner;

class MergeArray {
	// 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {
		int pa = 0; // 배열 a의 인덱스
		int pb = 0; // 배열 b의 인덱스
		int pc = 0; // 배열 c의 인덱스

		// 배열 a와 b의 원소들을 비교하여 작은 값을 배열 c에 저장
		while (pa < na && pb < nb) {
			c[pc++] = (a[pa] <= b[pb] ? a[pa++] : b[pb++]);
			// a[pa]가 b[pb]보다 작거나 같으면 a[pa]를 배열 c에 저장하고, pa와 pc를 증가
			// 그렇지 않으면 b[pb]를 배열 c에 저장하고, pb와 pc를 증가
		}

		// 배열 a나 b에 남은 원소들을 배열 c에 저장
		while (pa < na) {
			c[pc++] = a[pa++];
		}
		while (pb < nb) {
			c[pc++] = b[pb++];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = { 2, 4, 6, 8, 11, 13 }; // 정렬된 배열 a
		int[] b = { 1, 2, 3, 4, 9, 16, 21 }; // 정렬된 배열 b
		int[] c = new int[13]; // 병합 결과를 저장할 배열 c

		System.out.println("두 개의 배열을 병합");

		merge(a, a.length, b, b.length, c); // 배열 a와 b를 병합하여 배열 c에 저장

		System.out.println("배열 a와 b를 병합하여 배열 c에 저장하였습니다.");
		System.out.println("배열 a: ");
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		System.out.println("배열 b: ");
		for (int i = 0; i < b.length; i++)
			System.out.println("b[" + i + "] = " + b[i]);

		System.out.println("배열 c: ");
		for (int i = 0; i < c.length; i++)
			System.out.println("c[" + i + "] = " + c[i]);
	}
}
