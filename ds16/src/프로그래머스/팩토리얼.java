package 프로그래머스;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution3 sol = new Solution3();
		int answer = sol.solution(n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution3 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 10; i++){
            if(fac(i) <= n) {
            	answer = i;
            }
        }
        return answer;
    }
	
	int fac(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return n * fac(n - 1);
		}
	}
}