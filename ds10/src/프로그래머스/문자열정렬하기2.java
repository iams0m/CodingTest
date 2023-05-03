package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 s = new Solution2();
		String answer = s.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution2 {
	public String solution(String my_string) {
		char[] my_char = my_string.toLowerCase().toCharArray();
		Arrays.sort(my_char);
		return new String(my_char);

	}

}
