package 프로그래머스;

import java.util.Scanner;

public class 게임369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		Solution2 sol = new Solution2();
		int count = sol.solution(order);
		System.out.println(count);
		sc.close();

	}
}

class Solution2 {
	public int solution(int order) {
		int count = 0;
		String orderStr = "" + order;
		
		for (int i = 0; i < orderStr.length(); i++) {
			if (orderStr.charAt(i) == '3' || orderStr.charAt(i) == '6' || orderStr.charAt(i) == '9') {
				count++;
			}
		}
		
		return count;
    }
}