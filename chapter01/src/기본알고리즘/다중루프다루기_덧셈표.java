package 기본알고리즘;

public class 다중루프다루기_덧셈표 {

	public static void main(String[] args) {
		System.out.print("   |"); // 가로축 헤더 출력
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i); // 숫자를 3자리로 정렬하여 출력
		System.out.println("\n---+---------------------------"); // 구분선 출력, \n : 줄바꿈(개행)

		// 구구단 내용 출력
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i); // 세로축 헤더 출력
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j); // 구구단 곱셈 결과 출력
			System.out.println(); // 한 행이 끝나면 줄바꿈
		}
	}

}
