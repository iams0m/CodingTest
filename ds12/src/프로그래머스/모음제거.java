package 프로그래머스;

import java.util.Scanner;

public class 모음제거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 sol = new Solution2();
		String answer = sol.solution(sc.next());
		System.out.println(answer);
		sc.close();

	}
}

class Solution2 {
	public String solution(String my_string) {
        String answer = "";
        String[] replace = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < replace.length; i++){
            if(my_string.contains(replace[i])){
                answer = my_string.replaceAll(replace[i], "");
                my_string = answer;
            }else{
                answer = my_string;
            }
        }
        return answer;
    }
}