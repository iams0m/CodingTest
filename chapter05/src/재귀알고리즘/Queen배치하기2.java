package 재귀알고리즘;

// 8x8 체스판 위에 퀸을 배치하는 문제를 해결하기 위한 재귀 알고리즘
// 각 행과 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
public class Queen배치하기2 {
	static boolean[] flag = new boolean[8]; // 각 행에 퀸이 이미 배치했는지 확인(같은 행에 중복하여 퀸이 배치되는 것을 방지하기 위한 표시)
	static int[] a = new int[8]; // 각 열의 퀸의 위치

	// 각 열의 퀸의 위치 출력
	static void print() {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%2d", a[i]); // 정수를 2자리로 표시하여 a[i]값 출력
		System.out.println();
	}

	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < a.length; j++) {
			if (flag[j] == false) {
				a[i] = j; // 퀸을 j행에 배치함
				if (i == 7) { // 모든 열에 퀸을 배치(마지막 열까지 퀸을 배치한 경우)
					print(); // 현재 퀸의 위치를 출력
				} else {
					flag[j] = true; // 배치된 상탯값을 true로 변경
					set(i + 1); // set메서드를 재귀적으로 호출
					flag[j] = false; // 배치되지 않은 상탯값을 false로 변경
				}
			}

		}
	}

	public static void main(String[] args) {
		set(0); // 0열부터 퀸 배치 시작
	}
}