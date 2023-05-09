package 프로그래머스;

import java.util.Arrays;

public class 칠의개수 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		int answer = 0;
		
		for (int i = 0; i < array.length; i++) {
			String num = Integer.toString(array[i]);
			System.out.println(num);
			String[] arr = num.split("");
			System.out.println(Arrays.toString(arr));
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("7")) {
					answer++;
				}
			}
		}
		System.out.println(answer);

	}

}
