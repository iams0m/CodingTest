package 재귀알고리즘;

import java.util.Scanner;

public class Hanoi {
	static void move(int no, int x, int y) {
		// 1. 바닥의 원반을 제외한 그룹(원반[1]~원반[no-1])을 시작 기둥에서 중간 기둥으로 이동(재귀 호출)
		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		
		// 2. 바닥의 원반 no를 시작 기둥에서 목표 기둥으로 옮김
		System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
		
		// 3. 바닥의 원반을 제외한 그룹(원반[1]~원반[no-1])을 중간 기둥에서 목표 기둥으로 이동(재귀 호출)
		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		int n = sc.nextInt();

		move(n, 1, 3); // 1번 기둥에 쌓인 n개를 3번 기둥으로 옮김

	}

}
