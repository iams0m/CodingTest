package 프로그래머스;

import java.util.Scanner;

public class 개미군단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Solution4 sol = new Solution4();
		int answer = sol.solution(count);
		System.out.println(answer);
		sc.close();

	}
}

class Solution4 {
	public int solution(int hp) {
        int answer = hp / 5 + (hp % 5) / 3 + (hp % 5) % 3;
        return answer;
    }
}