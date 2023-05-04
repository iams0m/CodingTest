package 프로그래머스;

import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		String my_string = "hi12392";
		my_string = my_string.replaceAll("[a-z]", "");
		int[] answer = new int[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.charAt(i) - '0';
		}
		
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));

	}

}
