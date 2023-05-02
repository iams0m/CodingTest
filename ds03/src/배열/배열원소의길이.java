package 배열;

import java.util.Arrays;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		Solution7 sol = new Solution7();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution7 {
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        return answer;
    }
}
