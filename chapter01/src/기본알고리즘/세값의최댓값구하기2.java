package 기본알고리즘;

public class 세값의최댓값구하기2 {

	// 최댓값을 반복해서 구할 때에는 메서드로 처리하면 편리
	static int max(int a, int b, int c) {
		int max = a;

		if (b > max)
			max = b;

		if (c > max)
			max = c;

		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(3,2,1) = " + max(3,2,1));
		System.out.println("max(3,2,2) = " + max(3,2,2));
		System.out.println("max(3,1,2) = " + max(3,1,2));
		System.out.println("max(3,2,3) = " + max(3,2,3));
		System.out.println("max(2,1,3) = " + max(2,1,3));
		System.out.println("max(3,3,2) = " + max(3,3,2));
		System.out.println("max(3,3,3) = " + max(3,3,3));
		System.out.println("max(2,2,3) = " + max(2,2,3));
		System.out.println("max(2,3,1) = " + max(2,3,1));
		System.out.println("max(2,3,2) = " + max(2,3,2));
		System.out.println("max(1,3,2) = " + max(1,3,2));
		System.out.println("max(2,3,3) = " + max(2,3,3));
		System.out.println("max(1,2,3) = " + max(1,2,3));
	}
}
