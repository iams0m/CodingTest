package 기본자료구조;

public class 배열의모든요소의합구하기 {

	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		double sum = 0; // 합계
		// 확장 for문
		// 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔합니다. 루프 본문에서는 현재 선택한 요소를 i로 표현합니다.
		// 변수 i : int형 정숫값인 '인덱스'를 나타내는 것이 아니라, double형 실숫값인 '스캔할 때 선택한 요소'를 나타냄
		for (double i : a)
			sum += i;
		
		/* for (int i = 0; i < a.length; i++) {
			sum += a[i];
		} */

		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}