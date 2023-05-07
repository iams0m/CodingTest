package 프로그래머스;

import java.util.Arrays;

public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] numbers = { 4, 455, 6, 4, -1, 45, 6 };
		String direction = "left";

		int[] answer = new int[numbers.length];
		if (direction.equals("right")) {
			answer[0] = numbers[numbers.length - 1];
			for (int i = 1; i < numbers.length; i++) {
				answer[i] = numbers[i - 1];
			}
		} else {
			answer[numbers.length - 1] = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}