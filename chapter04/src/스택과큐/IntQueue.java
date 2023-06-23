package 스택과큐;

//int형 고정 길이 큐

public class IntQueue {
	
	// 필드
	private int[] que; // 큐용 배열, 본체를 참조하는 배열 변수
	private int capacity; // 큐의 크기, 큐의 최대 용량을 저장하는 필드, 배열 que에 저장할 수 있는 최대 요솟수
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서, 인큐한 데이터 가운데 맨 뒤에 넣은 요소 하나 뒤 인덱스 저장(다음 인큐 데이터 저장 요소의 인덱스 미리 준비)
	private int num; // 현재 데이터 개수
	// front값과 rear값이 같을 때, 큐가 비어 있는지 또는 가득 찼는지 구별할 수 없는 상황을 피하기 위해 필요한 변수

	// 실행시 예외: 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행시 예외: 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// 생성자(constructor)
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity]; // 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException(); // 큐가 가득 차서 인큐할 수 없는 경우
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 큐가 빈 경우
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 큐가 빈 경우
		return que[front];
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x) // 검색 성공
				return idx;
		}
		return -1; // 검색 실패
	}
	
	// 큐에서 x를 검색하여 맨앞에서 몇 번째인지(발견하지 못하면 0) 반환
	public int search(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x) { // 검색 성공
				return i + 1;
			}
		}
		return 0; // 검색 실패
	}

	// 큐의 크기 반환
	public int getCapacity() {
		return capacity;
	}

	// 큐에 쌓여 있는 데이터 개수 반환
	public int size() {
		return num;
	}

	// 큐가 비어있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= capacity;
	}

	// 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
}