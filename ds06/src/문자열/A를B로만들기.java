package 문자열;

import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		int answer = 0;
		String before = "olleh";
		String after = "hello";
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		
		if (Arrays.equals(a, b)) {
			answer = 1;
		}
		
		System.out.println(answer);
		

	}

}
