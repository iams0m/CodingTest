package 프로그래머스;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();
		String answer = sol.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public String solution(String rsp) {
		String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.split("")[i].equals("0")){
                answer += "5";
            }else if(rsp.split("")[i].equals("2")){
                answer += "0";
            }else{
                answer += "2";
            }
        }
        return answer;
    }
}