package 프로그래머스;

import java.util.Scanner;

public class 순서쌍의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(count);
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public int solution(int n) {
        int count = 0;
        for(int i=1 ; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }
}
