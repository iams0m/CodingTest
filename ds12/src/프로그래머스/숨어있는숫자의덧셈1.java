package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution3 sol = new Solution3();
		int answer = sol.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution3 {
	public int solution(String my_string) {
		int answer = 0;
		String replace = "";
		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] arr = replace.split("");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
		return answer;
	}
}
