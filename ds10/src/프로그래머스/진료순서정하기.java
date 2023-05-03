package 프로그래머스;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = { 3, 76, 24 };
		int[] answer = new int[emergency.length];
		int[] temp = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			temp[i] = emergency[i];
		}

		Arrays.sort(temp);

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (temp[i] == emergency[j]) {
					answer[j] = emergency.length - i;
				}
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
