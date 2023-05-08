package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = "I love you";
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution sol = new Solution();
		String answer = sol.solution(my_string, num1, num2);
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public String solution(String my_string, int num1, int num2) {
		String answer = "";
        String[] s = my_string.split("");
        
        System.out.println(Arrays.toString(s));
        
        for(int i = 0; i < s.length; i++){
            if(i == num1) {
                answer += s[num2];
            }else if(i == num2){
                answer += s[num1];
            }else{
                answer += s[i];
            }
        }
        return answer;
    }
}