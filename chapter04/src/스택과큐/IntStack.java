package 스택과큐;

public class IntStack {
	private int[] stk; // push된 데이터를 저장하는 스택용 배열
	// stk[0] : 가장 먼저 push된 데이터를 저장하는 곳
	private int capacity; // 스택의 크기(스택에 쌓을 수 있는 최대 데이터 수)
	private int ptr; // 스택 포인터(스택에 쌓여 있는 데이터 수)
	// 스택이 비어 있으면, ptr = 0
	// 스택이 가득 차 있으면, ptr = capacity

	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// 생성자(constructor)
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없는 경우
			capacity = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity) { // 스택이 가득 차서 푸시할 수 없는 경우
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(top에 있는 데이터를 pop)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) { // 스택이 빈 경우
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// 스택의 크기를 반환
	public int getCapacity() {
		return capacity;
	}

	// 스택에 쌓여있는 데이터 갯수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= capacity;
	}

	// 스택 안의 모든 데이터를 bottom → top 순서로 표시
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}