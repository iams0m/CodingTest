package 기본자료구조;

public class 자료형이int인배열 {

	public static void main(String[] args) {
		int[] a = new int[5]; // 배열 선언

		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;

		// 각 요솟값 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// 배열 a의 각 요소의 자료형 : int형
		// 배열 a의 자료형 : int[5]형

	}

}
