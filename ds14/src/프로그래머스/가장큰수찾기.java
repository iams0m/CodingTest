package 프로그래머스;

import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		int[] answer = new int[2];
		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		
		answer[0] = max;
		answer[1] = index;
		
		System.out.println(Arrays.toString(answer));
	}

}
