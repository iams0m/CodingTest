package 프로그래머스;

import java.util.Scanner;

public class 합성수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution4 sol = new Solution4();
		int answer = sol.solution(n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution4 {
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count >= 3){
                answer++;
            }
        }
        return answer;
    }
}