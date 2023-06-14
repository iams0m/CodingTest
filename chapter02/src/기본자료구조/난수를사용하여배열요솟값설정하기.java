package 기본자료구조;

import java.util.Random;
import java.util.Scanner;

public class 난수를사용하여배열요솟값설정하기 {

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Random r = new Random(); // Random 클래스형의 변수(r)를 만들기 위한 선언
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수: ");
		int num = sc.nextInt();

		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + r.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");

	}

}
