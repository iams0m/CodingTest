package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int min = n[0];
		for (int x : n) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최소값은 " + min);

		// 2
		Random r = new Random(5);

		int[] n2 = new int[20];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(900);
		}
		Arrays.sort(n2);
		System.out.println("최대값은 " + n2[19]);

		// 3
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println(s1.equals(s2));

		if (s1.length() > s2.length()) {
			System.out.println("s1의 글자수가 더 많다.");
		} else if (s1.length() < s2.length()) {
			System.out.println("s2의 글자수가 더 많다.");
		} else {
			System.out.println("글자수 동일");
		}

		// 4
		String s3 = "나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6, 21).toUpperCase());
		// String result = s3.substring(6, 21);
		// System.out.println(result.toUpperCase());

		// 5
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자");
		} else if (s4.charAt(0) == '2') {
			System.out.println("여자");
		}

	}

}
