package 문자열;

public class 함수만들기연습2 {
	// 함수 만들기
	public static void 밥먹기(String food) {
		System.out.println("1. 요리를 한다.");
		System.out.println("2. 오늘은 " + food);
	}

	public static void 운동(String workout) {
		System.out.println("1. " + workout + " 가서 운동하기");
	}

	public static void 잠(String sleep) {
		System.out.println("1. " + sleep + "자기");
	}

	public static void 씻기() {
		System.out.println("1. 세수 한다.");
		System.out.println("2. 비누칠을 한다.");
		System.out.println("3. 헹군다.");
	}

	public static void main(String[] args) {
		// 함수 호출해보기
		System.out.println("<하루 일과 시작>");
		System.out.println("[오전 일과]");
		씻기();
		운동("헬스장");
		밥먹기("샌드위치");
		잠("낮잠");
		System.out.println("----------------");
		System.out.println("[오후 일과]");
		밥먹기("짜장면");
		System.out.println("외출 하기");
		밥먹기("족발");
		운동("운동장");
		씻기();
		잠("잠");

		System.out.println("<하루 일과 끝!>");

	}

}