package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수2_입력받아넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // 입력할 개수
		int k = sc.nextInt(); // k번째 큰수
		int[] array = new int[size]; // {0, 0, 0, 0, 0} <- 3, 4, 5, 1, 2
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
		System.out.println(k + "번째 큰 수 : " + array[array.length - k]);
		Arrays.sort(array);
	}

}
