package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 영어가싫어요 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution3 s = new Solution3();
		long answer = s.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution3 {
	public long solution(String numbers) {
		String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for (int i = 0; i < numbers_arr.length; i++) {
			numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
		}
		long answer = Long.parseLong(numbers);
		return answer;

	}

}
