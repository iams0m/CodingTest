package 스택과큐;

import java.util.Scanner;

class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대 64 개를 푸시할 수 있는 스택

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = sc.nextInt(); // 메뉴 선택을 위해 정수 입력 받음

			if (menu == 0)
				break; // 0을 입력하면 반복문 종료

			int x;
			switch (menu) {
			case 1: // (1)푸시
				System.out.print("데이터: ");
				x = sc.nextInt(); // 데이터를 입력 받음
				try {
					s.push(x); // 입력 받은 데이터를 스택에 추가
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // (2)팝
				try {
					x = s.pop(); // 스택에서 데이터를 꺼냄
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3: // (3)피크
				try {
					x = s.peek(); // 스택에서 데이터를 확인 (꺼내지는 않음)
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4: // (4)덤프
				s.dump(); // 스택에 저장된 모든 데이터를 출력
				break;
			}
		}
	}
}