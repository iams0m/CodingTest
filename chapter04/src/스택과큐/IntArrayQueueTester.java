package 스택과큐;

import java.util.Scanner;

class IntArrayQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntArrayQueue s = new IntArrayQueue(64); // IntArrayQueue 객체 생성 (최대 길이: 64)

		while (true) {
			System.out.println("현재 데이터 개수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1) 인큐　(2) 디큐　(3) 피크　" + "(4) 덤프　(0) 종료 : ");

			int menu = sc.nextInt(); // 메뉴 선택을 위해 정수 입력 받음

			if (menu == 0)
				break; // 0을 입력하면 반복문 종료

			int x = 0;
			switch (menu) {
			case 1: // (1) 인큐
				System.out.print("데이터 : ");
				x = sc.nextInt(); // 데이터를 입력 받음
				try {
					s.enque(x); // 입력 받은 데이터를 큐에 추가
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;

			case 2: // (2) 디큐
				try {
					x = s.deque(); // 큐에서 데이터를 꺼냄
					System.out.println(" 디큐한 데이터는 " + x + "입니다.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // (3) 피크
				try {
					x = s.peek(); // 큐에서 데이터를 확인 (꺼내지는 않음)
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // (4) 덤프
				s.dump(); // 큐에 저장된 모든 데이터를 출력
				break;
			}
		}
	}
}