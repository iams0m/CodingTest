package 배열;

import java.util.Scanner;

public class 입력하여배열에값넣기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		sc.close();
		for (double d : numbers) {
			System.out.println(d);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 " + i);
			}
			if (numbers[i] == 33.3) {
				System.out.println("33.3의 위치는 " + i);
			}
			
		}

	}

}
