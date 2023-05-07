package 프로그래머스;

import java.util.Scanner;

public class 주사위의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] box = {10, 8, 6};
		int n = sc.nextInt();
		Solution3 sol = new Solution3();
		int answer = sol.solution(box, n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution3 {
	public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}