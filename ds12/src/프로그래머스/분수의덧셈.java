package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 분수의덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numer1 = sc.nextInt();
		int denom1 = sc.nextInt();
		int numer2 = sc.nextInt();
		int denom2 = sc.nextInt();
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(numer1, denom1, numer2, denom2);
		System.out.println(Arrays.toString(answer));
		sc.close();

	}
}

class Solution5 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int num = (numer1 * denom2) + (numer2 * denom1); // 분자
		int den = denom1 * denom2; // 분모
		// 기약분수 만들기
		for(int i = num - 1; i >1; i--){
            if(num % i == 0 && den % i ==0){
                num = num / i;
                den = den / i;
            }
        }
		int[] answer = {num, den};
        return answer;
    }
}
