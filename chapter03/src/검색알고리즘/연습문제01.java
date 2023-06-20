package 검색알고리즘;

import java.util.Scanner;

public class 연습문제01 {
	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
	static int seqSearchSen(int[] a, int n, int key) {
		int i; // 반복문에서 사용할 변수 i 초기화
		
		a[n] = key; // 보초를 추가

		for (i = 0; a[i] != key; i++) { // 배열의 요소가 키와 같지 않은 경우에만 반복
		}
		return i == n ? -1 : i;
	}
	
	/*
	 * a[n] = key; // 보초를 추가
	 * 
	 * for (int i = 0; i <= n; i++) { // 항상 반복문을 완전히 실행
	 * 	if (a[i] == key) { 
	 * 	return i; // 찾은 값이 배열의 원래 데이터인지 아니면 보초인지 판단 
	 * 	}
	 * }
	 *  return -1;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; // 요솟수가 num + 1인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색 값 : "); // 키값을 읽력받음
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
	}
}