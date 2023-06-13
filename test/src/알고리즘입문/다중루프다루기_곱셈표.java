package 알고리즘입문;

public class 다중루프다루기_곱셈표 {

	public static void main(String[] args) {
		System.out.println("----- 구구단 곱셈표 -----");

		for (int i = 1; i <= 9; i++) { // 행 루프
			for (int j = 1; j <= 9; j++) { // 열 루프
				System.out.printf("%3d", i * j); // i * j를 3자리로 출력
			} // 열 루프 종료
			System.out.println(); // 줄 바꿈
		} // 행 루프 종료

	}

}
