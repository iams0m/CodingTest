package 검색알고리즘;

class Id {
	private static int counter = 0; // 아이디를 몇 개 부여했는지 저장(클래스 변수)
	// 클래스 변수 : 인스턴스와 관계없이 1개만 생성, 특정 시점에 아이디를 몇 번까지 부여했는지 알 수 있음
	private int id; // 아이디(인스턴스 변수)
	// 인스턴스 변수 : 인스턴스마다 각각 1개씩 할당, 해당 인스턴스의 아이디를 나타냄

	// 생성자(constructor)
	public Id() {id = ++counter;}

	// counter를 반환하는 클래스 메서드(가장 큰 식별 번호를 얻음 => 마지막에 부여한 아이디 반환)
	public static int getCounter() {
		return counter;
	}

	// 아이디를 반환하는 인스턴스 메서드(식별 번호를 얻음 => 개별 인스턴스 아이디 반환)
	public int getId() {
		return id;
	}

}

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id(); // 아이디1
		Id b = new Id(); // 아이디2

		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());

		System.out.println("부여한 아이디의 개수 = " + Id.getCounter());
	}

}
