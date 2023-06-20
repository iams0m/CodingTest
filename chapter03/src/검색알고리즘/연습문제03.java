package 검색알고리즘;

import java.util.Scanner;

public class 연습문제03 {

	// 배열 a에서 특정 키(key)의 모든 인덱스를 찾아서 idx 배열에 저장하고, 저장된 개수를 반환하는 함수
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // 찾은 인덱스의 개수를 저장하는 변수
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[count++] = i; // 키(key)와 일치하는 값이면 해당 인덱스를 idx 배열에 저장하고 count를 증가시킴
			}
		}
		return count; // 찾은 인덱스의 개수를 반환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt(); // 배열의 크기를 입력받음
		int[] x = new int[num]; // 입력된 크기(num)로 배열 x를 생성
		int[] y = new int[num]; // 찾은 인덱스를 저장할 배열 y

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); // 배열 x의 각 요소를 사용자로부터 입력받음
		}

		System.out.print("검색 값 : ");
		int ky = sc.nextInt(); // 검색할 키(key) 값을 입력받음
		int count = searchIdx(x, num, ky, y); // searchIdx 함수를 호출하여 키(key)와 일치하는 인덱스를 찾고, 개수를 count에 저장
		if (count == 0) {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println("그 값은 x[" + y[i] + "]에 있습니다."); // 찾은 인덱스를 출력
			}
		}

	}

}
