package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		System.out.println(Arrays.toString(num));
		
		// 임시 변수를 만들자.
		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		System.out.println(Arrays.toString(num));

	}

}
