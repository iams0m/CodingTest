package 검색알고리즘;

public class GenericClassTester {

	// 제네릭 클래스
	static class GenericClass<T> {
		private T xyz; 
		// T : 타입 매개변수, 클래스 내에서 사용할 타입
		// 필드 : xyz

		// 생성자
		GenericClass(T t) {
			this.xyz = t;
		}

		// xyz 필드의 값을 반환하는 메서드
		T getXyz() {
			return xyz;
		}
	}

	public static void main(String[] args) {
		// String 타입의 GenericClass 객체 생성
		GenericClass<String> s = new GenericClass<String>("ABC");

		// Integer 타입의 GenericClass 객체 생성
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz()); // String 객체의 xyz 필드 값 출력
		System.out.println(n.getXyz()); // Integer 객체의 xyz 필드 값 출력
	}

}
