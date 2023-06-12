package 알고리즘입문;

public class 세값의중앙값구하기3 {

	static int med(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) // 처음 if가 성립하지 않는 경우
			return a;
		else if ((a > b && c < b) || (a < b && c > b)) // 2번째 if에서도 같은 판단을 수행 => 효율이 떨어짐
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med(3,2,1) = " + med(3, 2, 1)); // a＞b＞c
		System.out.println("med(3,2,2) = " + med(3, 2, 2)); // a＞b＝c
		System.out.println("med(3,1,2) = " + med(3, 1, 2)); // a＞c＞b
		System.out.println("med(3,2,3) = " + med(3, 2, 3)); // a＝c＞b
		System.out.println("med(2,1,3) = " + med(2, 1, 3)); // c＞a＞b
		System.out.println("med(3,3,2) = " + med(3, 3, 2)); // a＝b＞c
		System.out.println("med(3,3,3) = " + med(3, 3, 3)); // a＝b＝c
		System.out.println("med(2,2,3) = " + med(2, 2, 3)); // c＞a＝b
		System.out.println("med(2,3,1) = " + med(2, 3, 1)); // b＞a＞c
		System.out.println("med(2,3,2) = " + med(2, 3, 2)); // b＞a＝c
		System.out.println("med(1,3,2) = " + med(1, 3, 2)); // b＞c＞a
		System.out.println("med(2,3,3) = " + med(2, 3, 3)); // b＝c＞a
		System.out.println("med(1,2,3) = " + med(1, 2, 3)); // c＞b＞a

	}

}
