package 배열;

import java.util.Random;

public class 배열최대값구하기1 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000); // 정수 +-21억 -> 0~999
		}
		int max = numbers[0];
		for (int x : numbers) {
			if (x > max) {
				max = x;
			}
		} // for
		System.out.println(max);

	} // main
}
