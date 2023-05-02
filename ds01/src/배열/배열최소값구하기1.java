package 배열;

public class 배열최소값구하기1 {

	public static void main(String[] args) {
		int[] s = { 90, 80, 20, 60, 70 };
		int min = s[0];
		//for문(c타입), for-each문 둘 다 사용 가능
		for (int x : s) {
			if (x < min) {
				min = x;
			}
		} // for
		System.out.println(min); //for문 끝나고 나서 출력
	} // main
}
