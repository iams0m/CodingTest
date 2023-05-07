package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class n의배수고르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = sc.nextInt();
		Solution4 sol = new Solution4();
		String answer = sol.solution(n, numlist);
		System.out.println(answer);
		sc.close();

	}
}

class Solution4 {
	public String solution(int n, int[] numlist) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				count++;
			}
		}
        int[] answer = new int[count];
        for (int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				answer[j] = numlist[i];
				j++;
			}
		}
        return Arrays.toString(answer);
    }
}