package 검색알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt(); // 배열의 크기를 입력받음
		int[] x = new int[num]; // 입력된 크기(num)로 배열 x를 생성

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0] : ");
		x[0] = sc.nextInt(); // 첫 번째 요소를 입력받음, 입력된 요소들이 오름차순으로 정렬되어야 하기 때문에 바로 입력받음

		// 오름차순으로 정렬되도록 do-while문 작성
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "]");
				x[i] = sc.nextInt(); // 두 번째부터 num-1번째 요소까지 입력받음
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.println("검색 값 : ");
		int ky = sc.nextInt(); // 검색할 값(ky)을 입력받음

		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소 검색
		if (idx < 0) {
			System.out.println("검색 값의 요소가 없습니다.");
		} else {
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
		}
	}

}
