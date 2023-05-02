package 배열;
import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] s = {5, 2, 1, 9, 11, 15, 17};
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		
		//1. 정렬
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		//2. 중앙 위치를 구하자.
		int center = s.length / 2;
		
		//3. 배열의 중앙 위치값 get
		int answer = s[center];
		System.out.println(answer);

	}

}
