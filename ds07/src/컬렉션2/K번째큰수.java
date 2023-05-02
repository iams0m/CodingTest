package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int k = 2;
		// 정렬(오름차순)
		Arrays.sort(array);
		// 다시 저장
		for (int x : array) {
			System.out.println(x + " ");
		}
		// 보기 좋게 String으로 만들어줌
		System.out.println(Arrays.toString(array)); // [[1, 2, 3, 4, 5, 6, 7]
		System.out.println("제일 큰 수 : " + array[array.length - 1]);
		System.out.println("두번째 큰 수 : " + array[array.length - 2]);
		System.out.println(k + "번째 큰 수 : " + array[array.length - k]);
	}

}
