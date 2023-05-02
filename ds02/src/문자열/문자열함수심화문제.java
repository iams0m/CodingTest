package 문자열;

import java.util.Arrays;

public class 문자열함수심화문제 {

	public static void main(String[] args) {
		//6
		String s5 = " [  10, 20, 30, 40, 50]";
		//String result = s5.replace("[", "").replace("]", "").trim();
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s55 = s5.split(", ");
		//System.out.println(s55[1]);
		
		int sum = 0;
		for (String x : s55) {
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		System.out.println("총합은 " + sum);
		
		//7
		int[] newArray = new int[s55.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]);
		}
		System.out.println(Arrays.toString(newArray));
	}

}
