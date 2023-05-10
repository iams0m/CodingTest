package 프로그래머스;

import java.util.Scanner;

public class flag에따라다른값반환하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean flag = false;
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution2 sol = new Solution2();
		int answer = sol.solution(a, b, flag);
		System.out.println(answer);
		sc.close();

	}
}

class Solution2 {
	public int solution(int a, int b, boolean flag) {
        if (flag) {
        	return a + b;
		}else {
			return a - b;
		}
    }
}