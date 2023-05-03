package 프로그래머스;

import java.util.Scanner;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String answer = s.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public String solution(String my_string) {
		char[] my_char = my_string.toCharArray();
		String answer = "";
		for (int i = my_char.length - 1; i >= 0; i--) {
			answer += my_char[i];
		}
		return answer;

	}

}
