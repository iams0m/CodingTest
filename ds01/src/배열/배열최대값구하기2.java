package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기2 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10];
		int[] s2 = new int[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000); // 정수 +-21억 -> 0~999
			s2[i] = r.nextInt(1000); // 정수 +-21억 -> 0~999
		}
		Arrays.sort(s); // 오름차순 정렬, 원본을 바꾸는 파괴형 함수
		System.out.println("최소값은 " + s[0]);
		System.out.println("최대값은 " + s[9]);

		if (Arrays.equals(s, s2)) {
			System.out.println("2개의 배열이 같다.");
		}else {
			System.out.println("2개의 배열이 다르다.");
		}
		
		String result = Arrays.toString(s);
		System.out.println(result);
		
		System.out.println("글자수 : " + result.length());
		System.out.println("배열의 개수 : " + s.length);
		
	} // main
}
